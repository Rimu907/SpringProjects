package com.jt.service;

import org.apache.catalina.User;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * @Date:2021/12/7 21:54
 * @Author:NANDI_GUO
 */
@Component
@Service
public class UserServiceImpl implements UserService{
    @Override
    public String login(User user) {
        String password = user.getPassword();
        //2.利用md5加密算法 进行加密
        String username = user.getUsername();

        return "成功注册";
    }
}
