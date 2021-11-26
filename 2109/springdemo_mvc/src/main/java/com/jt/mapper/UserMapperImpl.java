package com.jt.mapper;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Repository;

/**
 * @Date:2021/11/26 16:33
 * @Author:NANDI_GUO
 */
@Repository
@PropertySource(value = "classpath:/user.properties",encoding = "utf-8")
public class UserMapperImpl implements UserMapper{
    @Value("${name}")
    private String username;
    @Override
    public void addUser() {
        System.out.println("添加了用户:"+username);
    }
}
