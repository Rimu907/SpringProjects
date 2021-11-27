package com.jt.controller;

import com.jt.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * @Date:2021/11/27 9:48
 * @Author:NANDI_GUO
 */
@Controller
public class Driver {
    @Autowired
    private CarService carService;

    public void start(){
        carService.start();
    }
    public void stop(){
        carService.stop();
    }
}
