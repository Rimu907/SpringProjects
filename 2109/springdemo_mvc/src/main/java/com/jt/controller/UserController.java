package com.jt.controller;

import com.jt.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

/**
 * @Date:2021/11/26 16:37
 * @Author:NANDI_GUO
 */
@Component
@Controller
public class UserController {
    @Autowired
    private UserService userService;
    public void addUser(){
        userService.addUser();
    }
}
