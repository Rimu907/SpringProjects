package com.jt.service;

import org.springframework.stereotype.Service;

/**
 * @Date:2021/11/29 9:55
 * @Author:NANDI_GUO
 */
@Service
public class UserServiceImpl implements UserService{
    @Override
    public void addUser() {
        try {
            System.out.println("开始数据库事务");
            System.out.println("添加了新用户");
            int a = 1/0;
            System.out.println("提交数据库事务");
        }catch (Exception e){
            System.out.println("事务回滚");
        }
    }
}
