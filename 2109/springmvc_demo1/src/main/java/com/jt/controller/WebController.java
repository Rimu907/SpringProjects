package com.jt.controller;

import org.springframework.web.bind.annotation.*;

/**
 * @Date:2021/12/3 10:14
 * @Author:NANDI_GUO
 */
@RestController
@CrossOrigin
@RequestMapping("/web")
public class WebController {
    /**
     * URL: http://localhost:8080//web/hello
     * 类型:get
     * 返回值:String
     *  */
    @GetMapping("/hello")
    public String hello(){
        return "你好,世界";
    }

    @GetMapping("/hello1")
    public String hello1(){
        return "你好,嵌套";
    }
    @GetMapping("/hello2")
    public String hello2(){
        return "你好,Vscode";
    }
}
