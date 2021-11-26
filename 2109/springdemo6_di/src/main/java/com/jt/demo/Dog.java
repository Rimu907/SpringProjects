package com.jt.demo;

import org.springframework.stereotype.Component;

/**
 * @Date:2021/11/26 11:48
 * @Author:NANDI_GUO
 */
@Component
public class Dog implements Pet{
    @Override
    public void hello() {
        System.out.println("汪汪汪");
    }
}
