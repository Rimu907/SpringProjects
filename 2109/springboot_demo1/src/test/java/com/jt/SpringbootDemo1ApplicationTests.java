package com.jt;

import com.jt.controller.HelloController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringbootDemo1ApplicationTests {
    @Autowired
    private HelloController helloController;

    @Test
    void contextLoads() {
        System.out.println(helloController.HelloController());
    }

}
