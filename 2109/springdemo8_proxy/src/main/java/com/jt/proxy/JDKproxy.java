package com.jt.proxy;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.net.ProxySelector;

/**
 * @Date:2021/11/29 11:14
 * @Author:NANDI_GUO
 */
public class JDKproxy {
    //获传入target目标对象 获取代理对象
    //利用代理对象 实现方法的扩展
    public static Object getProxy(Object target){
        ClassLoader classLoader = target.getClass().getClassLoader();//得到了target的类加载器对象
        Class<?>[] interfaces = target.getClass().getInterfaces();//得到了target类实现的接口

        return Proxy.newProxyInstance(classLoader,interfaces,invocationHandler(target));
    }
    //要求必须传递目标对象
    public static InvocationHandler invocationHandler(Object target){
        return new InvocationHandler() { /*动态代理*/
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println("事务开始");
                Object result = method.invoke(target, args);
                System.out.println("事务提交");
                return result;
            }
        };
    }
    /*====================================华丽的分割线=======================================*/
    public static Object getTime(Object target){
        ClassLoader classLoader = target.getClass().getClassLoader();//得到了target的类加载器对象
        Class<?>[] interfaces = target.getClass().getInterfaces();//得到了target类实现的接口

        return Proxy.newProxyInstance(classLoader,interfaces,invocationHandler2(target));
    }
    public static InvocationHandler invocationHandler2(Object target){
        return new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                long l1 = System.currentTimeMillis();

                Object result = method.invoke(target, args);

                long l2 = System.currentTimeMillis();
                System.out.println("用的时间是:"+(l2-l1));
                return result;
            }
        };
    }
}
