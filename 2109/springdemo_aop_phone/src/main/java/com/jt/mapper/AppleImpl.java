package com.jt.mapper;

import org.springframework.stereotype.Repository;

/**
 * @Date:2021/11/29 19:18
 * @Author:NANDI_GUO
 */
@Repository
public class AppleImpl implements PhoneInterface{
    @Override
    public void call() {
        System.out.println("苹果正在打电话");
    }

    @Override
    public void message() {
        System.out.println("苹果正在发短信");
    }

    @Override
    public void play() {
        System.out.println("苹果正在打联盟");
    }
}
