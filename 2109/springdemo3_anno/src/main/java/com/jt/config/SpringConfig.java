package com.jt.config;

import com.jt.demo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Date:2021/11/25 14:40
 * @Author:NANDI_GUO
 */
/*
* 1.xml形式
*   <bean id ="user" class ="com.jt.demo.User/">
* 2.注解形式
*   Map集合的结构 Map<方法名，方法的返回值>
* */
@Configuration //将当前类标识为配置类
public class SpringConfig {
    @Bean
    public User user(){
        return new User();
    }
}
