package com.jt.service;

import com.jt.mapper.ICar;
import jdk.nashorn.internal.parser.Scanner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import java.util.Map;

/**
 * @Date:2021/11/27 9:47
 * @Author:NANDI_GUO
 */
@Service
public class CarServiceImpl implements CarService {
    @Autowired
    @Qualifier("truck")
    public ICar car;


    @Override
    public void start(){
        car.start();
    }
    @Override
    public void stop(){
        car.stop();
    }

    public CarServiceImpl() throws Exception {
        //context.getBean(CarServiceImpl.class);
        Field field = CarServiceImpl.class.getDeclaredField("car");
        Qualifier qualifier = field.getAnnotation(Qualifier.class);
        System.out.println(qualifier.value());

        InvocationHandler h = Proxy.getInvocationHandler(qualifier);
        Field hField = h.getClass().getDeclaredField("memberValues");
        hField.setAccessible(true);
        Map memberValues = (Map) hField.get(h);
        memberValues.put("value", "tank");
        System.out.println(qualifier.value());
    }

}
