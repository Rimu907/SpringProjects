package com.jt.springtest;

import com.jt.config.SpringConfig;
import com.jt.service.UserService;
import com.jt.service.UserServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javax.swing.*;

/**
 * @Date:2021/11/29 9:56
 * @Author:NANDI_GUO
 */
public class TestDemo1 {
    @Test
    public void testDe(){
        ApplicationContext context =
                new AnnotationConfigApplicationContext(SpringConfig.class);
        UserServiceImpl user = context.getBean(UserServiceImpl.class);
        user.addUser();
    }
}
