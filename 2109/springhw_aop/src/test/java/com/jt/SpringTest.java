package com.jt;

import com.jt.config.SpringConfig;
import com.jt.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.ArrayList;

/**
 * @Date:2021/11/30 18:53
 * @Author:NANDI_GUO
 */
public class SpringTest {
    @Test
    public void testDemo(){
        ApplicationContext context=
                new AnnotationConfigApplicationContext(SpringConfig.class);
        UserService userService = context.getBean(UserService.class);
        userService.add();
    }
}
