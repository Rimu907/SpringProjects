package com.jt.demo;

import org.springframework.stereotype.Component;

import java.sql.SQLOutput;
import java.util.SortedMap;

/**
 * @Date:2021/11/26 9:23
 * @Author:NANDI_GUO
 */

@Component
public class User {
    public User(){
        System.out.println("我是无参构造,创建对象");
    }
    public void say(){
        System.out.println("测试对象是单例还是多例");
    }
}
