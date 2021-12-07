package com.jt;

import com.jt.mapper.DogMapper;
import com.jt.mapper.UserMapper2;
import com.jt.pojo.Dog;
import com.jt.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

/**
 * @Date:2021/12/7 9:45
 * @Author:NANDI_GUO
 */
@SpringBootTest
public class TestMybatis2 {
    @Autowired
    private UserMapper2 userMapper2;
    @Autowired
    private DogMapper dogMapper;

    @Test
    public void testDemo1(){
        User user = new User();
        user.setAge(18).setSex("女");
        List<User> userList = userMapper2.findUserList(user);
        System.out.println(userList);
    }

    @Test
    public void testDemo2(){
        User user = new User();
        user.setId(231).setName("冬日").setAge(18);
        userMapper2.updateUser(user);
        System.out.println("更新成功");
    }

    @Test
    public void testDog(){
        List<Dog> dogList = dogMapper.findAll();
        System.out.println(dogList);
    }
}
