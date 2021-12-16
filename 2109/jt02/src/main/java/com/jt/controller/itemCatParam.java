package com.jt.controller;

import com.jt.pojo.ItemDesc;
import com.jt.pojo.User;
import com.jt.service.ItemCatService;
import com.jt.vo.SysResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Date:2021/12/10 20:05
 * @Author:NANDI_GUO
 */
@RestController
@CrossOrigin
@RequestMapping("/itemCatParam")
public class itemCatParam {
    @Autowired
    private ItemCatService itemCatService;

    @GetMapping("/findItemCatParamListByType")
    public SysResult findItemCatParamListByType(ItemDesc itemDesc) {
        itemCatService.findItemCatParamListByType(itemDesc);
        return SysResult.fail();
    }
}
