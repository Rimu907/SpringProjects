package com.jt;

import com.jt.config.SpringConfig;
import com.jt.demo.Person;
import com.jt.demo.User;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Date:2021/11/26 9:24
 * @Author:NANDI_GUO
 */

public class SpringTest {
    @Test
    void testDemo5(){
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        User user1 = context.getBean(User.class);
        User user2 = context.getBean(User.class);
        System.out.println(user1==user2);
    }

    @Test
    void testDemo5_2(){
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        //从容器中获取对象
        User user1 = context.getBean(User.class);
        user1.say();
    }
    @Test
    void testDemo5_3Init(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        //从容器中获取对象
        Person person = context.getBean(Person.class);
        person.doWork();
        context.close();
    }
}
