package com.jt.pojo;

import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * @Date:2021/12/2 16:59
 * @Author:NANDI_GUO
 */
@Data
@Accessors(chain = true)
public class User implements Serializable {
    private Integer id;
    private String name;

}
