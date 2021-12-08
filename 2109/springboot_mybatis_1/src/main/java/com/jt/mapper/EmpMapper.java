package com.jt.mapper;

import com.jt.pojo.Emp;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @Date:2021/12/7 15:32
 * @Author:NANDI_GUO
 */
@Mapper
public interface EmpMapper {
    List<Emp> findAll();
}
