package com.jt.controller;

import com.jt.pojo.Rights;
import com.jt.service.RightsService;
import com.jt.vo.SysResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @date 2021/12/9 14:11
 * @Author:YILANG
 */
@RestController
@RequestMapping("/rights")
@CrossOrigin
public class RightsController {

    @Autowired
    private RightsService rightsService;

    @GetMapping("/getRightsList")
    public SysResult getRightsList(){
        List<Rights> list =  rightsService.getRightsList();
        return SysResult.success(list);
    }

}
