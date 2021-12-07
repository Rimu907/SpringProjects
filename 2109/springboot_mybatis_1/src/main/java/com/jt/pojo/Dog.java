package com.jt.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * @Date:2021/12/7 11:26
 * @Author:NANDI_GUO
 */
@Data
@Accessors(chain = true)
@NoArgsConstructor
@AllArgsConstructor
public class Dog implements Serializable {
    private Integer dogId;
    private String dogName;
    private Integer age;
}
