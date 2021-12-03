package com.jt.controller;

import com.jt.pojo.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Date:2021/12/1 11:40
 * @Author:NANDI_GUO
 */
//@Controller
//@ResponseBody
    /*
    * 注意事项:
    *   1.springMVC中的请求路径不能重复
    * @return
    * */
@RestController
@RequestMapping("/rest")
public class RestUserController {
    @RequestMapping("/findJSON")
    public User findUser(User user) {
        user.setId(105);
        user.setSex("女");
        return user;
    }
}
