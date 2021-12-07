package com.jt.controller;

import com.jt.pojo.User;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * @Date:2021/12/1 15:27
 * @Author:NANDI_GUO
 */
@RestController
@CrossOrigin //主要解决跨域的问题
@RequestMapping("/axios")
public class AxiosController {
    /**
     * url:http://localhost:8080/axios/getUserById?id=100
     * 参数: id=100
     * 返回值:User对象的JSON
     * */

    @RequestMapping("/getUserById")
    public User getUserById(Integer id) {
        User user = new User();
        user.setId(id);
        user.setAge(1000);
        user.setName("好好学习");
        user.setSex("女");
        return user;
    }

    @RequestMapping("/getUserByNA")
    public List<User> getUserByNA(User user) {
        /**
         * url:http://localhost:8080/axios/getUserByNA?id=100
         * 参数: id=100
         * 返回值:User对象的JSON
         * */

        /*Class<User> userClass = User.class;
        User user3 = userClass.newInstance();
        user3.setId(789);*/

        List<User> users = new ArrayList<>();
        users.add(user);
        users.add(user);

        return users;
    }

    @RequestMapping("/getUserByNS/{sex}")
    public List<User> getUserByNS(User user) {
        
        List<User> list = new ArrayList<>();
        list.add(user);
        list.add(user);

        System.out.println(user.getName());
        return list;
    }

    @PutMapping("/updateUser")
    public String updateUser(@RequestBody User user) { ;
        System.out.println(user);
        System.out.println(user.getName());
        return "修改成功";
    }

    @DeleteMapping("/deleteUser/{id}")
    public String deleteUser(User user) {
        System.out.println(user);
        return "删除成功";
    }


}
