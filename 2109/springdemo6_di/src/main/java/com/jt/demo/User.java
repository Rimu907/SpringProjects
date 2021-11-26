package com.jt.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @Date:2021/11/26 11:44
 * @Author:NANDI_GUO
 */

@Component//user交给spring容器处理
public class User {
//    @Autowired()
//    @Qualifier("dog")//该注解不能单独使用,必须配合Autowired使用
    @Resource(name="cat") //@Autowired+@Qualifier("cat")
    private Pet pet; //将昂当前接口的实现类自动注入

    public void say(){
        //调用宠物方法
        pet.hello();
    }
}
