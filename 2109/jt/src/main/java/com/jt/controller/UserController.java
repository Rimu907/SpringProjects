package com.jt.controller;

import com.jt.pojo.User;
import com.jt.service.UserService;
import com.jt.vo.SysResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
@CrossOrigin
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/findAll")
    public List<User> findAll(){


        return userService.findAll();
    }
    /**
     * 业务:完成用户登录操作
     * URL:/user/login
     * 参数:username/password  json串
     * 返回值SysResult对象  token秘钥
     */
    @PostMapping("/login")
    public SysResult login(@RequestBody User user){
        //业务逻辑:根据用户名密码查询数据库  true:token  false  null
        String token = userService.login(user);
        if (token == null){
            return SysResult.fail();
        }
        return SysResult.success(token);
    }

    @PostMapping("/register")
    public SysResult register(@RequestBody User user){
        String token = userService.register(user);
        if (token == null){
            return SysResult.fail();
        }
        return SysResult.success(token);
    }
}
