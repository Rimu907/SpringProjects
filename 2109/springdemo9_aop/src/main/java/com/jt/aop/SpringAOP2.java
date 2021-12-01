package com.jt.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @Date:2021/11/30 14:13
 * @Author:NANDI_GUO
 */
@Component //将类交给Spring容器
@Aspect
@Order(1)
public class SpringAOP2 {
    @Around("@annotation(com.jt.anno.ndg)")
    public Object around(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("环绕B开始");
        Object result = joinPoint.proceed();
        System.out.println("环绕B结束");
        return result;
    }
}
