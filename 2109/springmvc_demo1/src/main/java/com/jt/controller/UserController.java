package com.jt.controller;

import com.jt.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Arrays;

/**
 * @Date:2021/11/30 15:48
 * @Author:NANDI_GUO
 */
@Controller //讲这个类交给springMVC管理,springMVC交给spring容器管理
@ResponseBody //讲数据转化为"特殊字符串"返回
public class UserController {
    /**
     * URL地址:http://localhost:8080/hello get请求
     * http://localhost:8080/yilang get请求
     * http://localhost:8080/nandi get请求
     * 参数: 无
     * 返回值: "你好,SpringMVC的字符串"
     * */
    @RequestMapping("/hello")
    public String hello(){
        return "你好SpringMVC";
    }
    @RequestMapping("/yilang")
    public String yilang(){
        return "你好一郎,先干三碗大米饭";
    }
    @RequestMapping("/nandi")
    public String nandi(){
        return "起飞,诶,飞!!";
    }

    /*
     * 需求:接受参数 name=xxx, age = xxx
     * url= http://localhost:8080/findUserByNA?name=tomcat&age=18
     * url= http://localhost:8080/findUserByNA2?name=tomcat&age=18
     * 同名提交问题
     * url= http://localhost:8080/hobby?hobby=敲代码,打篮球,打游戏,熬夜
     *
     * 知识点:
     * 1.通过url中的key获取数据
     * 2.如果参数众多,可以使用对象的方式接受,要求必须有set方法
     * */
    @RequestMapping("/hobby")
    public String hobby(String[] hobby){
//        String[] h = hobby.split(",");
//        return h[1];
        return Arrays.toString(hobby);
    }

    @RequestMapping("/findUserByNA")
    public String findUserByNA(String name, int age){
        if (!name.equals("tomcat")||age!=18){
            return "登陆错误";
        }
        return "登陆成功数据正确:"+name+":"+age;
    }

    @RequestMapping("/findUserByNA2")
    public String findUserByNA2(User user){
        return user.toString();
    }

}
