package com.jt.springtest;

import com.jt.config.SpringConfig;
import com.jt.controller.Driver;
import com.jt.mapper.RaceCar;
import com.jt.mapper.Tank;
import com.jt.mapper.Truck;
import com.jt.service.CarService;
import com.jt.service.CarServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javax.xml.ws.Service;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import java.util.Map;

/**
 * @Date:2021/11/27 9:50
 * @Author:NANDI_GUO
 */

public class CarTest {
    @Test
    public void testCar() throws Exception {

        CarServiceImpl.type = "raceCar";

        ApplicationContext context =
                new AnnotationConfigApplicationContext(SpringConfig.class);

        Driver driver = context.getBean(Driver.class);
        driver.start();
        driver.stop();

    }
}
