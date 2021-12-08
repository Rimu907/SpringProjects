package com.jt;

import com.jt.mapper.DeptMapper;
import com.jt.mapper.EmpMapper;
import com.jt.mapper.UserAnnoMapper;
import com.jt.pojo.Dept;
import com.jt.pojo.Emp;
import com.jt.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @Date:2021/12/7 15:14
 * @Author:NANDI_GUO
 */
@SpringBootTest
public class TestMybatisAnno {
    @Autowired
    private UserAnnoMapper userAnnoMapper;
    @Test
    public void testfindAll(){
        List<User> userList = userAnnoMapper.findAll();
        System.out.println(userList);
    }

    @Test
    public void findId(){
        int id = 1;
        User user = userAnnoMapper.findId(id);
        System.out.println(user);
    }

    @Test
    public void UpdateUser(){
        User user = new User();
        user.setAge(18).setSex("女").setName("郎妹");
        userAnnoMapper.insertUser(user);
        System.out.println("插入成功");
    }

    @Test
    public void testdelUser(){
        int id = 3;
        userAnnoMapper.delUser(id);
        System.out.println("删除成功");
    }
    @Test
    @Transactional
    public void testCached1(){
       List<User> userList1 = userAnnoMapper.findCache();
       List<User> userList2 = userAnnoMapper.findCache();
       List<User> userList3 = userAnnoMapper.findCache();
       List<User> userList4 = userAnnoMapper.findCache();
    }
}
