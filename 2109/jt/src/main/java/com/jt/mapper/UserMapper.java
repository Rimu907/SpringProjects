package com.jt.mapper;

import com.jt.pojo.User;

import java.util.List;

public interface UserMapper {

    List<User> findAll();


    void insertUser(User user);

    User findUserByUP(User user);
}
