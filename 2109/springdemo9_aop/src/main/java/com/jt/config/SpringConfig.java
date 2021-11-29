package com.jt.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @Date:2021/11/29 9:53
 * @Author:NANDI_GUO
 */
@Configuration
@ComponentScan("com.jt")
@EnableAspectJAutoProxy
public class SpringConfig {
}
