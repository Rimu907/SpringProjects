package com.jt.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @Date:2021/11/29 19:23
 * @Author:NANDI_GUO
 */
@Component
@Aspect
public class PhoneAOP {
    @Pointcut("bean(phoneServiceImpl)")
    public void pointcut(){}

    @Around("pointcut()")
    public Object around(ProceedingJoinPoint joinPoint) throws Throwable {

        System.out.println("正在输入密码:");
        for (int i = 1; i <= 4 ; i++) {
            System.out.print("*");
        }
        System.out.println("\n解锁成功");
        Object res = joinPoint.proceed();
        System.out.println("电源键被点击");
        System.out.println("屏幕熄灭");
        System.out.println("===========================");
        return res;
    }
}
