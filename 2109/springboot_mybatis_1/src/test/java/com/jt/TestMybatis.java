package com.jt;

import com.jt.mapper.UserMapper;
import com.jt.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

@SpringBootTest
public class TestMybatis {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void testDemo1(){
        List<User> userList = userMapper.findAll();
        System.out.println(userList);
    }
    @Test
    public void testFindUserById(){
        int id = 1;
        User user = userMapper.findUserById(id);
        System.out.println(user);
    }
    /*
    * 如果是多个参数封装数据,则一般采用对象的方式封装
    * */
    @Test
    public void testFindByName() throws Exception {
        String name = "孙尚香";
        int age = 18;

        User user = User.class.newInstance().setAge(age).setName(name);
        List<User> userList = userMapper.findByName(user);
        System.out.println(userList);
    }

    @Test
    public void testFindByAge() throws Exception {
        int as = 18;
        int ae = 100;
        HashMap<String,Integer> map = new HashMap<>();
        map.put("as", as);
        map.put("ae", ae);
        List<User> userList = userMapper.findByAge(map);
        System.out.println(userList);
    }

    @Test
    public void testFindByAge2() throws Exception {
        int as = 18;
        int ae = 100;

        List<User> userList = userMapper.findUserByAge2(as,ae);
        System.out.println(userList);
    }

    @Test
    public void testFindByWord(){
        String word = "%"+"君"+"%";
        List<User> userList = userMapper.findUserByWord(word);
        System.out.println(userList);
    }

    @Test
    public void testFindListByIn(){
        int[] array = {1,2,3,5,7};
        List<User> userList = userMapper.findListByIn(array);
        System.out.println(userList);
    }
    @Test
    public void testInsertUser(){
        User user = new User();
        user.setName("张三").setAge(18).setSex("男");
        userMapper.saveUser(user);
        System.out.println("新增成功~");
    }

    @Test
    public void testFindR(){
        User user = new User();
        user.setAge(20);
        List<User> userList = userMapper.findR(user);
        System.out.println(userList);
    }
}