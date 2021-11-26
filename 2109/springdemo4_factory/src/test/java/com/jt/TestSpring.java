 package com.jt;

import com.jt.config.SpringConfig;
import com.jt.demo.User;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Calendar;

/**
 * @Date:2021/11/25 16:18
 * @Author:NANDI_GUO
 */
public class TestSpring {
    @Test
    public void testDemo4(){
        ApplicationContext context =
                new AnnotationConfigApplicationContext(SpringConfig.class);

        User user = context.getBean(User.class);
        User user1 = context.getBean(User.class);
        System.out.println(user==user1);
        user.say();
    }

    @Test
    public void testDemo2(){
        ApplicationContext context =
                new AnnotationConfigApplicationContext(SpringConfig.class);

        Calendar calendar = context.getBean(Calendar.class);
        System.out.println(calendar.getTime());
        System.out.println(calendar.getWeekYear());

    }
}
