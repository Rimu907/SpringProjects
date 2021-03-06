package com.jt.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @author 刘昱江
 * 时间 2021/2/2
 */
@Data
@Accessors(chain = true)
@TableName("user") //让对象与表明一一映射
public class User extends BasePojo{
    @TableId(type = IdType.AUTO)
    private Integer id;

    //@TableField("username") 如果属性与字段名称一致(包含驼峰规则,则注解可以省略)
    private String username;
    private String password;
    private String phone;
    private String email;
    private Boolean status;     //true 正常 false 停用
}
