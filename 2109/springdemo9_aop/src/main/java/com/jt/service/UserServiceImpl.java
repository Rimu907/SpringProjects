package com.jt.service;

import com.jt.anno.ndg;
import org.springframework.stereotype.Service;

/**
 * @Date:2021/11/29 9:55
 * @Author:NANDI_GUO
 */
@Service
//被代理者
public class UserServiceImpl implements UserService{ //必须是接口或者实现接口
    @Override //目标方法
    @ndg   //起标记作用
    public void addUser() {
        System.out.println("新增用户");
    }
    @ndg
    @Override
    public void delUser() {
        System.out.println("删除用户");
    }

    @Override
    @ndg
    public String findUser(){
        //int a = 1/0;
        return "发现新用户";
    }
}
