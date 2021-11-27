package com.jt.mapper;

import org.springframework.stereotype.Repository;

/**
 * @Date:2021/11/27 9:39
 * @Author:NANDI_GUO
 */
@Repository
public class RaceCar implements ICar {
    @Override
    public void start() {
        System.out.println("赛车启动啦 299km/h");
    }

    @Override
    public void stop() {
        System.out.println("赛车停止了");
    }
}
