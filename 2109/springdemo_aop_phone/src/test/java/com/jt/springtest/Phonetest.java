package com.jt.springtest;

import com.jt.config.SpringConfig;
import com.jt.service.PhoneService;
import jdk.nashorn.internal.parser.Scanner;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


/**
 * @Date:2021/11/29 19:34
 * @Author:NANDI_GUO
 */

public class Phonetest extends HttpServlet{
    @Test
    public void testPhones(){
        ApplicationContext context =
                new AnnotationConfigApplicationContext(SpringConfig.class);
        PhoneService phone = context.getBean(PhoneService.class);
        phone.call();
        phone.message();
        phone.play();
    }
}
