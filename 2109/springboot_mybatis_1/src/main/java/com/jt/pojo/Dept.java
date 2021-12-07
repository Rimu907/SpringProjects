package com.jt.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.List;

/**
 * @Date:2021/12/7 14:35
 * @Author:NANDI_GUO
 */
@Data
@Accessors(chain = true)
@NoArgsConstructor
@AllArgsConstructor
public class Dept implements Serializable {
    private Integer deptId;
    private String deptName;
    //部门表,一个部门有多个员工,所以用List存
    private List<Emp> emps;
}
