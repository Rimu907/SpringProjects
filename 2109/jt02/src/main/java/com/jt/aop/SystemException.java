package com.jt.aop;

import com.jt.vo.SysResult;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @Date:2021/12/10 17:06
 * @Author:NANDI_GUO
 */
@RestControllerAdvice
public class SystemException {
    @ExceptionHandler(RuntimeException.class)
    public SysResult exception(Exception e){
        System.err.println("代码写错啦!!");
        e.printStackTrace();
        return SysResult.fail();
    }
}
