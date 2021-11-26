package com.jt.mapper;

import org.springframework.stereotype.Repository;

/**
 * @Date:2021/11/26 20:25
 * @Author:NANDI_GUO
 */
@Repository
public class Samsung implements Phone{
    @Override
    public void call() {
        System.out.println("三星在打电话");
    }

    @Override
    public void message() {
        System.out.println("三星在发短信");
    }
}
