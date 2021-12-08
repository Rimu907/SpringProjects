package com.jt;

import com.jt.mapper.DeptMapper;
import com.jt.mapper.EmpMapper;
import com.jt.pojo.Dept;
import com.jt.pojo.Emp;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

/**
 * @Date:2021/12/7 15:14
 * @Author:NANDI_GUO
 */
@SpringBootTest
public class TestMybatis3 {
    @Autowired
    private EmpMapper empMapper;
    @Autowired
    private DeptMapper deptMapper;

    @Test
    public void testOne(){
        List<Emp> empList = empMapper.findAll();
        System.out.println(empList);
    }

    @Test
    public void testMore(){
        List<Dept> deptList = deptMapper.findAll();
        System.out.println(deptList);
    }
}
