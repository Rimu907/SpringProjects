package com.jt.controller;

import com.jt.service.PhoneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;
import javax.annotation.Resources;
import javax.xml.bind.PrintConversionEvent;

/**
 * @Date:2021/11/26 20:05
 * @Author:NANDI_GUO
 */
@Component
@Controller
public class PhoneController {
    @Autowired
    private PhoneService phoneService;

    public void call(){
        phoneService.call();
    }

    public void message(){
        phoneService.message();
    }
}
