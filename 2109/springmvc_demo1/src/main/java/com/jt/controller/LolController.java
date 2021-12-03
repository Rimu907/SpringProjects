package com.jt.controller;

import com.jt.pojo.User;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @Date:2021/12/1 19:56
 * @Author:NANDI_GUO
 */
@RestController
@CrossOrigin
@RequestMapping("/Lol")
public class LolController {

    @RequestMapping("/getAccount/{server}/{name}")
    public List<User> getAccount(User user) {
        List<User> list = new ArrayList<>();
        list.add(user);
        return list;
    }
}
