package com.jt;

import com.jt.config.SpringConfig;
import com.jt.demo.User;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Date:2021/11/25 15:01
 * @Author:NANDI_GUO
 */
public class TestSpring {
    //利用注解的方式管理对象
    @Test
    public void testDemo1(){
        //利用注解的形式启动Spring容器
        ApplicationContext context =
                new AnnotationConfigApplicationContext(SpringConfig.class);
        //从容器中获取对象
        User user1 = context.getBean(User.class);
        //对象调用方法
        user1.say();
    }
}
