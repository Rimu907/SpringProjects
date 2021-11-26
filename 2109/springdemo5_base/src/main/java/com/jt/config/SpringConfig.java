package com.jt.config;

import com.jt.demo.User;
import org.springframework.context.annotation.*;

/**
 * @Date:2021/11/26 9:21
 * @Author:NANDI_GUO
 */

@Configuration
@ComponentScan("com.jt")

public class SpringConfig {
    @Bean
    @Scope("prototype")
    //@Lazy
    public User user(){
        return new User();
    }
}
