package com.jt.service;

import com.jt.mapper.ICar;
import com.jt.mapper.ITank;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 * @Date:2021/11/27 9:47
 * @Author:NANDI_GUO
 */
@Service
public class CarServiceImpl implements CarService {
//    @Autowired
//    @Qualifier("truck")
//    private ICar car;

    @Autowired
    @Qualifier("tank")
    private ITank car2;
    @Override
    public void start(){
        car2.start();
    }
    @Override
    public void stop(){
        car2.stop();
    }
    public void shoot(){
        car2.shoot();
    }
}
