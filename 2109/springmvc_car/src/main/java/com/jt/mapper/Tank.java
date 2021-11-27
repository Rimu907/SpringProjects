package com.jt.mapper;

import org.springframework.stereotype.Repository;

/**
 * @Date:2021/11/27 11:00
 * @Author:NANDI_GUO
 */
@Repository
public class Tank implements ITank{
    @Override
    public void start() {
        System.out.println("坦克启动了 咔咔咔");
    }

    @Override
    public void stop() {
        System.out.println("坦克停下了 嗤嗤哧");
    }

    @Override
    public void shoot() {
        System.out.println("轰 轰 轰");
    }
}
