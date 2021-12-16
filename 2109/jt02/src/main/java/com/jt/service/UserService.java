package com.jt.service;

import com.jt.pojo.User;
import com.jt.vo.PageResult;

import java.util.List;

public interface UserService {
    

    List<User> findAll();

    void register(User user) throws Exception;

    String login(User user);

    PageResult findUserList(PageResult pageResult);

    void updateUserStatus(User user);

    void deleteUser(User user);

    void modifyUser(User user);

    User getUser(User user);
}
