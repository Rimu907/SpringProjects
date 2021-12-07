package com.jt.mapper;

import com.jt.pojo.Dog;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @Date:2021/12/7 11:28
 * @Author:NANDI_GUO
 */
@Mapper
public interface DogMapper {
    List<Dog> findAll();
}
