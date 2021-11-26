package com.jt.demo;

import org.springframework.stereotype.Component;

/**
 * @Date:2021/11/26 11:48
 * @Author:NANDI_GUO
 */
@Component //key: cat value: cat对象
public class Cat implements Pet {
    @Override
    public void hello() {
        System.out.println("喵喵~");
    }
}
