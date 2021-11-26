package com.jt;

import com.jt.demo.User;
//import org.apache.catalina.User;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Date:2021/11/25 11:22
 * @Author:NANDI_GUO
 */
public class TestSpring {
    @Test
    public void testDemo1(){
        String resource = "spring.xml";
        ApplicationContext context =
                new ClassPathXmlApplicationContext(resource);

        User user = (User)context.getBean("user");
        User user2 = context.getBean(User.class);

        user.say();
        user2.say();
    }
    @Test
    public void testDemo2() throws IllegalAccessException, InstantiationException {
        User user = User.class.newInstance();
        user.say();
    }
}
