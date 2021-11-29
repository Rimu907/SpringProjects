package com.jt.springtest;

import com.jt.config.SpringConfig;
import com.jt.proxy.CGlibProxy;
import com.jt.proxy.JDKproxy;
import com.jt.service.UserService;
import com.jt.service.UserServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javax.jws.soap.SOAPBinding;
import javax.swing.*;

/**
 * @Date:2021/11/29 9:56
 * @Author:NANDI_GUO
 */
public class TestDemo1 {
//    @Test
//    public void testDe(){
//        ApplicationContext context =
//                new AnnotationConfigApplicationContext(SpringConfig.class);
//        //获取目标对象
//        UserServiceImpl user = context.getBean(UserServiceImpl.class);
//        //获取代理对象
//        UserService proxy0 = (UserService)JDKproxy.getProxy(user);
//        proxy0.addUser();
//        proxy0.delUser();
//
//        UserService proxy1 = (UserService)JDKproxy.getTime(user);
//        proxy1.addUser();
//        proxy1.delUser();
//    }
@Test
public void testDe(){
    ApplicationContext context =
            new AnnotationConfigApplicationContext(SpringConfig.class);
    UserService userService = context.getBean(UserServiceImpl.class);
    UserService proxy = (UserService) CGlibProxy.getProxy(userService);
    proxy.addUser();
}
}
