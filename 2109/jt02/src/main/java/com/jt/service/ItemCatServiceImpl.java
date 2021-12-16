package com.jt.service;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.jt.mapper.ItemCatMapper;
import com.jt.pojo.Item;
import com.jt.pojo.ItemCat;
import com.jt.pojo.ItemDesc;
import com.jt.pojo.User;
import com.jt.vo.PageResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.sql.SQLOutput;
import java.sql.Wrapper;
import java.util.*;

/**
 * @Date:2021/12/10 15:29
 * @Author:NANDI_GUO
 */
@Service
public class ItemCatServiceImpl implements ItemCatService{
    @Autowired
    private ItemCatMapper itemCatMappermapper;

    @Override
    public List<ItemCat> getItemCatList(ItemCat user) {
        List<ItemCat> catList = itemCatMappermapper.getItemCatList();
        return catList;
    }

    @Override
    public void changeStatus(ItemCat itemCat) {
        itemCat.setUpdated(new Date());
        itemCatMappermapper.changeStatus(itemCat);
    }

    @Override
    @Transactional
    public void saveItemCat(ItemCat itemCat) {
        itemCat.setStatus(true);
//                .setCreated(new Date())
//                .setUpdated(new Date());
        itemCatMappermapper.insert(itemCat);
    }

    @Override
    public void updateItemCat(ItemCat itemCat) {
        itemCat.setUpdated(new Date());
        itemCatMappermapper.updateItemCat(itemCat);
    }

    @Override
    public void deleteItemCat(ItemCat itemCat) {
        if(itemCat.getLevel() == 3){
            itemCatMappermapper.deleteById(itemCat.getId());
            return;
        }

        if(itemCat.getLevel() == 2){
            QueryWrapper<ItemCat> wrapper = new QueryWrapper();
            wrapper.eq("parent_id", itemCat.getId());
            itemCatMappermapper.delete(wrapper);
            itemCatMappermapper.deleteById(itemCat.getId());
            return;
        }

        QueryWrapper<ItemCat> wrapper = new QueryWrapper();
        wrapper.eq("parent_id", itemCat.getId());
        List twoList = itemCatMappermapper.selectObjs(wrapper);
        if (twoList.size() == 0) {
            itemCatMappermapper.deleteById(itemCat.getId());
        }else{
            wrapper.clear();
            wrapper.in("parent_id", twoList)
                    .or()
                    .in("id", twoList)
                    .or()
                    .eq("id", itemCat.getId());
            itemCatMappermapper.delete(wrapper);
        }
    }


    @Override
    public List<ItemDesc> findItemCatParamListByType(ItemDesc itemDesc) {
        return null;
    }

    @Override
    public PageResult getItemList(PageResult pageResult) {
        long total = itemCatMappermapper.findItemTotal();
        int start = (pageResult.getPageNum()-1)*(pageResult.getPageSize());
        int size = pageResult.getPageSize();
        String query = pageResult.getQuery();
        List<User> rows = itemCatMappermapper.findItemList(start,size,query);

        pageResult.setTotal(total);
        pageResult.setRows(rows);

        return pageResult;
    }

    @Override
    public void updateItemStatus(Item item) {
        item.setUpdated(new Date());
        itemCatMappermapper.updateItemStatus(item);
    }

    @Override
    public void deleteItemById(Item item) {
        Integer id = item.getId();
        itemCatMappermapper.deleteItemById(item);
    }


    @Override
    public Map<Integer, List<ItemCat>> getMap(){

        Map<Integer, List<ItemCat>> map = new HashMap<>();
        List<ItemCat> List = itemCatMappermapper.selectList(null);

        for (ItemCat itemCat: List){
            int key = itemCat.getParentId();
            if (map.containsKey(key)){ //有数据
                map.get(key).add(itemCat);
            }else{ //没数据
                List<ItemCat> childrenList = new ArrayList<>();
                childrenList.add(itemCat);
                map.put(key, childrenList);
            }
        }
        return map;
    }

    @Override
    public List<ItemCat> findItemCatList(Integer level) {
        long l1 = System.currentTimeMillis();
        Map<Integer, List<ItemCat>> map = getMap();
        if (level == 1){
            return map.get(0);
        }else if (level == 2){
            return getTwoList(map);
        }
        long l2 = System.currentTimeMillis();
        System.out.println("运行的时间"+(l2-l1)+"ms");
        return getThreeList(map);
    }

    private List<ItemCat> getThreeList(Map<Integer, List<ItemCat>> map) {
        List<ItemCat> oneList = getTwoList(map);
        for (ItemCat oneItemCat : oneList){
            List<ItemCat> twoList = oneItemCat.getChildren();
            if (twoList == null){
                continue;
            }
            for (ItemCat twoItemCat : twoList){
                int key = twoItemCat.getId();
                List<ItemCat> threeList = map.get(key);
                twoItemCat.setChildren(threeList);
            }
        }
        return oneList;
    }

    private List<ItemCat> getTwoList(Map<Integer, List<ItemCat>> map) {
        List<ItemCat> oneList = map.get(0);
        for (ItemCat oneItemCat: oneList){
            int key = oneItemCat.getId();
            List<ItemCat> twoList = map.get(key);
            oneItemCat.setChildren(twoList);
        }
        return oneList;
    }

    /*
    @Override
    public List<ItemCat> findItemCatList(Integer level) {
        long l1 = System.currentTimeMillis();
        QueryWrapper<ItemCat> wrapper = new QueryWrapper<>();
        wrapper.eq("parent_id",0);
        List<ItemCat> oneList = itemCatMappermapper.selectList(wrapper);
        for (ItemCat onelist:oneList){
            int oneId = onelist.getId(); //遍历一级拿到所有id
            wrapper.clear();
            wrapper.eq("parent_id", oneId); //查出所有父级id = id 的列表
            List<ItemCat> twoList = itemCatMappermapper.selectList(wrapper);
            for (ItemCat twolist: twoList){
                int twoId = twolist.getId();
                wrapper.clear();
                wrapper.eq("parent_id", twoId);
                List<ItemCat> threeList = itemCatMappermapper.selectList(wrapper);
                twolist.setChildren(threeList);
            }
            onelist.setChildren(twoList);
        }
        long l2 = System.currentTimeMillis();
        System.out.println("代码运行时间:" + (l2-l1) + "ms");
        return oneList;
    }
    */
}
