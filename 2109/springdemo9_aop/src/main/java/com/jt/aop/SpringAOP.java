package com.jt.aop;

import jdk.Exported;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * @Date:2021/11/29 16:36
 * @Author:NANDI_GUO
 */

@Component //将类交给Spring容器
@Aspect
public class SpringAOP {
    //切面=切入点表达式+通知方法
    //切入点表达式：如果对象满足切入点表达式的判断，则spring自动为其创建代理对象
    //通知方法：对原有目标方法进行扩展的封装方法；；；
    /*切入点表达式：
    * bean id: userServiceImpl
    * 1.bean("bean的ID")
    * AOP规则: 如果目标对象满足切入点表达式的规则
    * */
    @Pointcut("bean(userServiceImpl)")
    public void pointcut(){}
    //在目标方法执行之前执行
    @Before("pointcut()")
    public void before(){
        System.out.println("我是前置通知!!!");
    }

    @AfterReturning("pointcut()")
    public void after(){
        System.out.println("我是后置通知!!!");
    }

    @AfterThrowing("pointcut()")
    public void afterThrowing(){
        System.out.println("我是异常通知!!!");
    }

    //最终通知
    @After("pointcut()")
    public void afterfinal(){
        System.out.println("我是最终通知!!!");
    }
    
    //重点 环绕通知 在目标方法前后都要执行 控制目标方法
    @Around("pointcut()")
    public Object around(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("================");
        System.out.println("环绕方法执行前!!!");
        Object result = joinPoint.proceed();
        System.out.println("环绕方法执行后!!!");
        System.out.println("================");
        return null;
    }
}
