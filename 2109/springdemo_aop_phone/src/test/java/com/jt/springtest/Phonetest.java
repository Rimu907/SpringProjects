package com.jt.springtest;

import com.jt.config.SpringConfig;
import com.jt.service.PhoneService;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Date:2021/11/29 19:34
 * @Author:NANDI_GUO
 */

public class Phonetest {
    @Test
    public void testPhones(){
        ApplicationContext context =
                new AnnotationConfigApplicationContext(SpringConfig.class);
        PhoneService phone = context.getBean(PhoneService.class);

        phone.call();
        phone.message();
        phone.play();
    }
}
