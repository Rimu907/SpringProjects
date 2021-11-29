package com.jt.mapper;

import com.jt.service.PhoneService;
import org.springframework.stereotype.Repository;

/**
 * @Date:2021/11/29 19:18
 * @Author:NANDI_GUO
 */
@Repository
public class SamsungImpl implements PhoneInterface{
    @Override
    public void call() {
        System.out.println("三星正在打电话");
    }

    @Override
    public void message() {
        System.out.println("三星正在发短信");
    }

    @Override
    public void play() {
        System.out.println("三星正在打联盟");
    }
}
