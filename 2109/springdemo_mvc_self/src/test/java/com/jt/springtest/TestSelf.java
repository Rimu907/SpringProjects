package com.jt.springtest;

import com.jt.config.SpringConfig;
import com.jt.controller.PhoneController;
import com.jt.mapper.Phone;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Date:2021/11/26 20:08
 * @Author:NANDI_GUO
 */
public class TestSelf {
    @Test
    public void testDemoself(){
        ApplicationContext context =
                new AnnotationConfigApplicationContext(SpringConfig.class);
        PhoneController p = context.getBean(PhoneController.class);

        p.call();
        p.message();
    }
}
