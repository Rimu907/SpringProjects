package com.jt.service;

import com.jt.pojo.Item;
import com.jt.pojo.ItemCat;
import com.jt.pojo.ItemDesc;
import com.jt.pojo.User;
import com.jt.vo.PageResult;

import java.io.Serializable;
import java.util.List;

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
}
