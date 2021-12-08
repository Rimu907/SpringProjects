package com.jt.service;

import com.jt.mapper.UserAnnoMapper;
import com.jt.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Date:2021/12/8 11:03
 * @Author:NANDI_GUO
 */
@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserAnnoMapper userAnnoMapper;

    @Override
    public List<User> passfindCache() {
        return null;
    }

    @Override
    public List<User> findAll() {
        return userAnnoMapper.findAll();
    }
}
