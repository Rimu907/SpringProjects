package com.jt.mapper;

import com.jt.pojo.Rights;

import java.util.List;

/**
 * @date 2021/12/9 14:08
 * @Author:YILANG
 */
public interface RightsMapper {
   List<Rights> getRightsList();
    List<Rights> finOneList();

    List<Rights> findtwoList(Integer id);
}
