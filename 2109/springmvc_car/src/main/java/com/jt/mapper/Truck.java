package com.jt.mapper;

import org.springframework.stereotype.Repository;

/**
 * @Date:2021/11/27 9:39
 * @Author:NANDI_GUO
 */
@Repository
public class Truck implements ICar {
    @Override
    public void start() {
        System.out.println("货车启动了 100km/h");
    }

    @Override
    public void stop() {
        System.out.println("货车停止了");
    }
}
