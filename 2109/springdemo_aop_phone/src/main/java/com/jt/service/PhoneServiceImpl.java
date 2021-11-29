package com.jt.service;

import com.jt.mapper.PhoneInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 * @Date:2021/11/29 19:21
 * @Author:NANDI_GUO
 */
@Service
public class PhoneServiceImpl implements PhoneService{
    @Autowired
    @Qualifier("samsungImpl")
    private PhoneInterface phoneInterface;

    @Override
    public void call() {
        phoneInterface.call();
    }

    @Override
    public void message() {
        phoneInterface.message();
    }

    @Override
    public void play() {
        phoneInterface.play();
    }
}
