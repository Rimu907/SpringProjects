package com.jt.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Date:2021/12/16 19:46
 * @Author:NANDI_GUO
 */
@RestController
@CrossOrigin
public class PortController {

    @Value("${server.port}")
    private Integer port;

    @GetMapping("/getPort")
    public String getPort(){

        return "当前端口号:"+port;
    }
}