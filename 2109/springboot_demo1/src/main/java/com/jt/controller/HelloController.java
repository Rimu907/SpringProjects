package com.jt.controller;

import com.jt.pojo.User;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Date:2021/12/2 16:37
 * @Author:NANDI_GUO
 */
@RestController
@PropertySource(value="classpath:/msg.properties",encoding="utf-8")
public class HelloController {
    @Value("${msg}")
    private String msg;

    @GetMapping("/hello")
    public String HelloController(){
        User user = new User();
        user.setId(100).setName("tomcat");
        return "我又行了!"+user.toString();
    }
}
