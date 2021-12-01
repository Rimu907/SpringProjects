package com.jt.service;

import com.jt.anno.Limit;
import com.jt.anno.Privilege;
import org.springframework.stereotype.Service;

/**
 * @Date:2021/11/30 17:52
 * @Author:NANDI_GUO
 */

@Service
public class UserServiceImpl implements UserService{
    @Limit
    @Privilege(name = "add")
    @Override
    public void add() {
        System.out.println("新增用户");
    }

    @Limit
    @Privilege
    @Override
    public void delete() {
        System.out.println("删除用户");
    }
}
