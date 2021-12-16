package com.jt.service;

import com.jt.pojo.Item;
import com.jt.vo.ItemVO;
import com.jt.vo.PageResult;
import com.jt.vo.SysResult;

/**
 * @Date:2021/12/15 9:29
 * @Author:NANDI_GUO
 */
public interface ItemService {
    PageResult getItemList(PageResult pageResult);

    void updateItemStatus(Item item);

    void deleteItemById(Item item);

    void saveItem(ItemVO itemVO);
}
