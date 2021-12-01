package com.jt.aop;

import jdk.Exported;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * @Date:2021/11/29 16:36
 * @Author:NANDI_GUO
 */

@Component //将类交给Spring容器
@Aspect
@Order(2)
public class SpringAOP {
    //切面=切入点表达式+通知方法
    //切入点表达式：如果对象满足切入点表达式的判断，则spring自动为其创建代理对象
    //通知方法：对原有目标方法进行扩展的封装方法；；；
    /*切入点表达式：
    * bean id: userServiceImpl
    * 1.bean("bean的ID")
    * AOP规则: 如果目标对象满足切入点表达式的规则
    * */
    //@Pointcut("bean(userServiceImpl)")
//    @Pointcut("within(com.jt.service..*)")
//    public void pointcut(){}
//    @Pointcut("execution(* com.jt.service..*.add*())")//对add开头进行拦截
//    public void pointcut(){}

    @Pointcut("@annotation(com.jt.anno.ndg)")
    public void pointcut(){}
    //在目标方法执行之前执行

//    @Before("pointcut()")
//    public void before(JoinPoint joinPoint) {
//
//        Class targetClass = joinPoint.getTarget().getClass();
//        String methodName = joinPoint.getSignature().getName();
//        String className = joinPoint.getSignature().getDeclaringTypeName();
//        Object[] objs = joinPoint.getArgs();
//
//        System.out.println("我是前置通知!!!");
//        System.out.println("类型:"+targetClass);
//        System.out.println("方法名称:"+methodName);
//        System.out.println("类的名称:"+className);
//        System.out.println("方法中携带的参数:"+ Arrays.toString(objs));
//
//    }
//
    @AfterReturning(value = "pointcut()",returning = "result")
    public void afterReturn(Object result){
        System.out.println("我是后置通知!!!!");
        System.out.println("用户的返回值为:"+result);
    }
//
//    @AfterThrowing(value = "pointcut()",throwing = "exception")
//    public void afterThrowing(Exception exception){
//        System.out.println("我是异常通知!!!");
//        System.out.println("获取异常信息:"+exception.getMessage());
//        exception.printStackTrace();
//    }
//
//    //最终通知
//    @After("pointcut()")
//    public void afterfinal(){
//        System.out.println("我是最终通知!!!");
//    }
    
    //重点 环绕通知 在目标方法前后都要执行 控制目标方法
    @Around("pointcut()")
    public Object around(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("================");
        System.out.println("环绕A方法执行前!!!");
        Object result = joinPoint.proceed();
        System.out.println("环绕A方法执行后!!!");
        System.out.println("================");
        return result;
    }
}
