package com.jt.demo;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @Date:2021/11/26 10:52
 * @Author:NANDI_GUO
 */
@Component
public class Person {
    public Person(){
        System.out.println("张三出生了");
    }
    @PostConstruct
    public void init(){
        System.out.println("张三成为少年奇才");
    }
    //业务方法
    public void doWork(){
        System.out.println("领取美人鱼");
    }
    @PreDestroy
    public void destory(){
        System.out.println("全世界倾听");
    }
}
