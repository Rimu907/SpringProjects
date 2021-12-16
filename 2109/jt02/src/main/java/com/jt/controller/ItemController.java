package com.jt.controller;

import com.jt.pojo.Item;
import com.jt.service.ItemCatService;
import com.jt.service.ItemService;
import com.jt.vo.ItemVO;
import com.jt.vo.PageResult;
import com.jt.vo.SysResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Date:2021/12/10 20:36
 * @Author:NANDI_GUO
 */
@RestController
@CrossOrigin
@RequestMapping("/item")
public class ItemController {
    @Autowired
    private ItemService itemService;

    @GetMapping("/getItemList")
    public SysResult getItemList(PageResult pageResult) {
        PageResult newpageResult = itemService.getItemList(pageResult);
        return SysResult.success(newpageResult);
    }

    @PutMapping("/updateItemStatus")
    public SysResult updateItemStatus(@RequestBody Item item){
        itemService.updateItemStatus(item);
        return SysResult.success();
    }

    @DeleteMapping("/deleteItemById")
    public SysResult deleteItemById(Item item){
        itemService.deleteItemById(item);
        return SysResult.success();
    }

    @PostMapping("/saveItem")
    public SysResult saveItem(@RequestBody ItemVO itemVO){
        itemService.saveItem(itemVO);
        return SysResult.success();
    }
}
