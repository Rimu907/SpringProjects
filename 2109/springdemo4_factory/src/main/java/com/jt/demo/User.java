package com.jt.demo;

import org.springframework.stereotype.Component;

/**
 * @Date:2021/11/25 16:02
 * @Author:NANDI_GUO
 */
@Component
public class User {
    public void say(){
        System.out.println("通过@Component注解实例化对象");
    }
}
