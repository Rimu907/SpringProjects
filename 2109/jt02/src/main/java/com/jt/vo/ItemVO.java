package com.jt.vo;

import com.jt.pojo.Item;
import com.jt.pojo.ItemDesc;
import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * @Date:2021/12/15 11:52
 * @Author:NANDI_GUO
 */

@Data
@Accessors(chain = true)
public class ItemVO implements Serializable{
    private Item item;
    private ItemDesc itemDesc;
}
