package com.jt.service;

import com.jt.pojo.User;
import org.springframework.stereotype.Service;

import java.util.List;
    
/**
 * @Date:2021/12/8 11:02
 * @Author:NANDI_GUO
 */

public interface UserService{
    List<User> passfindCache();

    List<User> findAll();
}
