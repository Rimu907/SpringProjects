package com.jt.service;
import com.jt.mapper.ItemCatMapper;
import com.jt.pojo.Item;
import com.jt.pojo.ItemCat;
import com.jt.pojo.ItemDesc;
import com.jt.pojo.User;
import com.jt.vo.PageResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

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
    public void saveItemCat(ItemCat itemCat) {
        itemCat.setCreated(new Date());
        itemCat.setUpdated(new Date());
        itemCatMappermapper.saveItemCat(itemCat);
    }

    @Override
    public void updateItemCat(ItemCat itemCat) {
        itemCat.setUpdated(new Date());
        itemCatMappermapper.updateItemCat(itemCat);
    }

    @Override
    public void deleteItemCat(ItemCat itemCat) {
        itemCatMappermapper.deleteItemCat(itemCat);
//        if(itemCat.getLevel() == 3){
//            itemCatMappermapper.deleteItemCat(itemCat);
//            return;
//        }
//
//        if(itemCat.getLevel() == 2){
//            itemCatMappermapper.delete(new QueryWrapper<>(itemCat).eq("parent_id", itemCat.getId()));
//            itemCatMappermapper.deleteItemCat(itemCat);
//        }
//
//        if(itemCat.getLevel() == 1){
//            QueryWrapper queryWrapper = new QueryWrapper();
//            queryWrapper.eq("parent_id", itemCat.getId());
//            List<ItemCat> list2 = itemCatMappermapper.selectList(queryWrapper);
//            for (ItemCat itemCat2 : list2){
//                QueryWrapper<ItemCat> queryWrapperTemp = new QueryWrapper<>();
//                queryWrapperTemp.eq("parent_id", itemCat2.getId());
//                itemCatMappermapper.delete(queryWrapperTemp);
//                itemCatMappermapper.deleteItemCat(itemCat2);
//            }
//            itemCatMappermapper.deleteItemCat(itemCat);
//        }
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
}
