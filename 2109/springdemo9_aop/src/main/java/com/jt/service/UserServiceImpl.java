package com.jt.service;

import org.springframework.stereotype.Service;

/**
 * @Date:2021/11/29 9:55
 * @Author:NANDI_GUO
 */
@Service
//被代理者
public class UserServiceImpl implements UserService{ //必须是接口或者实现接口
    @Override //目标方法
    public void addUser() {
        System.out.println("新增用户");
    }

    @Override
    public void delUser() {
        System.out.println("删除用户");
    }
}
