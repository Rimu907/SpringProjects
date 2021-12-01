package com.jt.aop;

import com.jt.anno.Privilege;
import com.jt.service.UserServiceImpl;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Date:2021/11/30 18:47
 * @Author:NANDI_GUO
 */
@Component
@Aspect
public class SpringAOP {

    private List<String> list = new ArrayList<>();
    @PostConstruct
    public void init(){
        list.add("add");
        list.add("delete");
        list.add("update");
        list.add("select");
    }

    @Around("@annotation(privilege)")
    @Order(1)
    public Object around2(ProceedingJoinPoint joinPoint,Privilege privilege) throws Throwable {
//        Method method = UserServiceImpl.class.getDeclaredMethod("add");
//        Privilege annotation = method.getAnnotation(Privilege.class);
//        System.out.println(annotation.name());
        System.out.println("用户的权限: "+privilege.name());

        if (!list.contains(privilege.name())){
            System.out.println("注解信息错误");
            return null;
        }
        Object res = joinPoint.proceed();
        return res;
    }

    @Around("@annotation(com.jt.anno.Limit)")
    @Order(2)
    public Object around(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("＝＝＝＝环绕通知开始＝＝＝＝");
        long start = System.currentTimeMillis();
        Object result = joinPoint.proceed();
        long end = System.currentTimeMillis();
        System.out.println("运行所需时间是:"+(end-start));
        System.out.println("类型是"+joinPoint.getTarget().getClass());
        System.out.println("类名是"+joinPoint.getSignature().getDeclaringTypeName());
        System.out.println("方法名称是"+joinPoint.getSignature().getName());
        System.out.println("参数:"+ Arrays.toString(joinPoint.getArgs()));
        System.out.println("＝＝＝＝环绕通知结束＝＝＝＝");
        return result;
    }
}
