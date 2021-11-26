package com.jt.factory;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.stereotype.Component;

import java.util.Calendar;

/**
 * @Date:2021/11/25 16:52
 * @Author:NANDI_GUO
 */

@Component
public class CalendarFactory implements FactoryBean<Calendar>{
    public CalendarFactory(){
        System.out.println("工程模式的无参构造");
    }
    @Override
    public Calendar getObject() throws Exception {
        System.out.println("工厂模式getObject被调用,正在返回对象...");
        return Calendar.getInstance();
    }

    @Override
    public Class<?> getObjectType() {
        return Calendar.class;
    }
}
