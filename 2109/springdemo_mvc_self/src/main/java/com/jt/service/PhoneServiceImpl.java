package com.jt.service;

import com.jt.mapper.Phone;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * @Date:2021/11/26 20:02
 * @Author:NANDI_GUO
 */
@Component
@Service
public class PhoneServiceImpl implements PhoneService{
    @Autowired
    @Qualifier("samsung")
    private Phone phone;

    @Override
    public void call() {
        phone.call();
    }

    @Override
    public void message() {
        phone.message();
    }
}
