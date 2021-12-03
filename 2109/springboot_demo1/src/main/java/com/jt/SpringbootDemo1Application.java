package com.jt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootDemo1Application {

    public static void main(String[] args) {
        //springBoot方式管理的spring容器
        System.out.println("最终项目启动");
        System.out.println("推");
        SpringApplication.run(SpringbootDemo1Application.class, args);
    }

}
