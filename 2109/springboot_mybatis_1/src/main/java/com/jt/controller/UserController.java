package com.jt.controller;

import com.jt.pojo.User;
import com.jt.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Date:2021/12/8 11:07
 * @Author:NANDI_GUO
 */
@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/findAll")
    public List<User> ControllerfindAll(){
        return userService.findAll();
    }
}
