package com.jt.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * @Date:2021/12/10 9:13
 * @Author:NANDI_GUO
 */
@Data
@Accessors(chain = true)
@NoArgsConstructor
@AllArgsConstructor
public class PageResult implements Serializable {
    private String query;
    private Integer pageNum;
    private Integer pageSize;
    private Long total;
    private Object rows;
}
