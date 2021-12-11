package com.jt.controller;

import com.jt.pojo.User;
import com.jt.service.UserService;
import com.jt.vo.PageResult;
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
    public List<User> findAll() {


        return userService.findAll();
    }

    /**
     * 业务:完成用户登录操作
     * URL:/user/login
     * 参数:username/password  json串
     * 返回值SysResult对象  token秘钥
     */
    @PostMapping("/login")
    public SysResult login(@RequestBody User user) {
        //业务逻辑:根据用户名密码查询数据库  true:token  false  null
        String token = userService.login(user);
        if (token == null) {
            return SysResult.fail();
        }
        return SysResult.success(token);
    }

    @PostMapping("/register")
    public SysResult register(@RequestBody User user) throws Exception {
        userService.register(user);
        return SysResult.success();
    }

    @GetMapping("/list")
    public SysResult findUserList(PageResult pageResult) {
        pageResult = userService.findUserList(pageResult);
        return SysResult.success(pageResult);
    }

    @PutMapping("/status/{id}/{status}")
    private SysResult updateUserStatus(User user){
        System.out.println(user);
        userService.updateUserStatus(user);
        return SysResult.success();
    }

    @DeleteMapping("/{id}")
    private SysResult deleteUser(User user){
        System.out.println(user);
        userService.deleteUser(user);
        return SysResult.success();
    }

    @GetMapping("/{id}")
    private SysResult getUser(User user){
        User nuser = userService.getUser(user);
        return SysResult.success(nuser);
    }

    @PutMapping("/updateUser")
    private SysResult ModifyUser(@RequestBody User user){
        userService.modifyUser(user);
        return SysResult.success();
    }
}
