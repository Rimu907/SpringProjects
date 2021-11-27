package com.jt.springtest;

import com.jt.config.SpringConfig;
import com.jt.controller.Driver;
import com.jt.mapper.Tank;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Date:2021/11/27 9:50
 * @Author:NANDI_GUO
 */

public class CarTest {
    @Test
    public void testCar(){
        ApplicationContext context=
                new AnnotationConfigApplicationContext(SpringConfig.class);
        Driver driver = context.getBean(Driver.class);
        //Tank tank = context.getBean(Tank.class);
        driver.start();
        driver.stop();
        driver.shoot();
        //tank.shoot();

    }
}
