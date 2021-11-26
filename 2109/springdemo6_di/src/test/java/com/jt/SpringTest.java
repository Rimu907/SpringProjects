package com.jt;

import com.jt.config.SpringConfig;
import com.jt.demo.User;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Date:2021/11/26 11:57
 * @Author:NANDI_GUO
 */

public class SpringTest {
    @Test
    public void testDemo6(){
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        User user = context.getBean(User.class);
        user.say();
    }
}
