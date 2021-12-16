package com.jt.controller;

import com.jt.pojo.Item;
import com.jt.pojo.ItemCat;
import com.jt.pojo.User;

import com.jt.service.ItemCatService;
import com.jt.vo.SysResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Date:2021/12/10 14:21
 * @Author:NANDI_GUO
 */
@RestController
@CrossOrigin
@RequestMapping("/itemCat")
public class ItemCatController {
    @Autowired
    private ItemCatService itemCatService;

    @GetMapping("/findItemCatList0/{level}")
    public SysResult getItemCatList(ItemCat itemCat){
        List<ItemCat> itemCatList = itemCatService.getItemCatList(itemCat);
        return SysResult.success(itemCatList);
    }

    @PutMapping("/status/{id}/{status}")
    public SysResult changeStatus(ItemCat itemCat){
        itemCatService.changeStatus(itemCat);
        return SysResult.success();
    }

    @PostMapping("/saveItemCat")
    public SysResult saveItemCat(@RequestBody ItemCat itemCat){
        itemCatService.saveItemCat(itemCat);
        return SysResult.success();
    }

    @PutMapping("/updateItemCat")
    public SysResult updateItemCat(@RequestBody ItemCat itemCat){
        itemCatService.updateItemCat(itemCat);
        return SysResult.success();
    }

    @DeleteMapping("/deleteItemCat")
    public SysResult deleteItemCat(ItemCat itemCat){
        itemCatService.deleteItemCat(itemCat);
        return SysResult.success();
    }

    @GetMapping("/findItemCatList/{level}")
     public SysResult findItemCatList(@PathVariable Integer level){
        long l1 = System.currentTimeMillis();
        List<ItemCat> catlist = itemCatService.findItemCatList(level);
        long l2 = System.currentTimeMillis();

        return SysResult.success(catlist);
    }

}
