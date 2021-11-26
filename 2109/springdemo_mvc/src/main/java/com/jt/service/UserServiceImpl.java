package com.jt.service;

import com.jt.mapper.UserMapper;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * @Date:2021/11/26 16:35
 * @Author:NANDI_GUO
 */
@Component
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public void addUser() {
        userMapper.addUser();
    }
}
