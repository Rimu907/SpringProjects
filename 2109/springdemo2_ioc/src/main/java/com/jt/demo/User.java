package com.jt.demo;

/**
 * @Date:2021/11/25 10:50
 * @Author:NANDI_GUO
 */
public class User {
    public User(){
        System.out.println("我是无参构造,创建对象");
    }
    public void say(){
        System.out.println("我是用户,需要被spring容器管理");
    }
}
