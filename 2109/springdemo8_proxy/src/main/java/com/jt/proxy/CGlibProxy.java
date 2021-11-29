package com.jt.proxy;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @Date:2021/11/29 14:46
 * @Author:NANDI_GUO
 */

public class CGlibProxy {
    public static Object getProxy(Object target){
        //创建增强器对象
        Enhancer enhancer = new Enhancer();
        //设定父级 目标对象
        enhancer.setSuperclass(target.getClass());
        //定义回调方法 代理对象执行目标方法时调用
        enhancer.setCallback(getMethodInterceptor(target));
        return enhancer.create();
    }
    public static MethodInterceptor getMethodInterceptor(Object target){
        return new MethodInterceptor() {
            @Override
            public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
                System.out.println("事务开始");
                Object result = method.invoke(target, objects);
                System.out.println("事务结束");
                return result;
            }
        };
    }
}
