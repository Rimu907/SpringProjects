package com.jt.controller;

import com.jt.service.UserService;
import com.jt.vo.SysResult;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Date:2021/12/7 21:46
 * @Author:NANDI_GUO
 */
@Component
@RestController
@CrossOrigin
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/login")
    public String login(@RequestBody User user){

        //返回值一个字符串 token
        System.out.println(user);
        return "用户登录";
    }
}
