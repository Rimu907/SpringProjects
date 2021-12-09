package com.jt.service;

import com.jt.mapper.RightsMapper;
import com.jt.pojo.Rights;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @date 2021/12/9 14:10
 * @Author:YILANG
 */
@Service
public class RightsServiceImpl implements RightsService{

    @Autowired
    private RightsMapper rightsMapper;

    @Override
    public List<Rights> getRightsList() {
        return rightsMapper.getRightsList();
    }

}
