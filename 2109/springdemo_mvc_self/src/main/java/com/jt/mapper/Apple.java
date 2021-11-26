package com.jt.mapper;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

/**
 * @Date:2021/11/26 19:59
 * @Author:NANDI_GUO
 */

@Repository
public class Apple implements Phone{
    @Override
    public void call() {
        System.out.println("iphone在打电话");
    }

    @Override
    public void message() {
        System.out.println("iphone在发短信");
    }
}
