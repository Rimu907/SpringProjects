package com.jt;

import com.jt.config.SpringConfig;
import com.jt.controller.UserController;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Date:2021/11/26 16:16
 * @Author:NANDI_GUO
 */
public class SpringTest {
    @Test
    public void testDemo7(){
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        UserController user = context.getBean(UserController.class);
        user.addUser();
    }
}
