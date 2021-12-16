package com.jt.service;

import com.jt.pojo.Item;
import com.jt.pojo.ItemCat;
import com.jt.pojo.ItemDesc;
import com.jt.vo.PageResult;

import java.util.List;
import java.util.Map;

/**
 * @Date:2021/12/10 14:22
 * @Author:NANDI_GUO
 */
public interface ItemCatService {
    List<ItemCat> getItemCatList(ItemCat user);

    void changeStatus(ItemCat itemCat);

    void saveItemCat(ItemCat itemCat);

    void updateItemCat(ItemCat itemCat);

    void deleteItemCat(ItemCat itemCat);

    List<ItemDesc> findItemCatParamListByType(ItemDesc itemDesc);

    PageResult getItemList(PageResult pageResult);

    void updateItemStatus(Item item);

    void deleteItemById(Item item);

    List<ItemCat> findItemCatList(Integer level);

    Map<Integer, List<ItemCat>> getMap();
}
