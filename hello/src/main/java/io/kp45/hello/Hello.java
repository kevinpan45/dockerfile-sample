package io.kp45.hello;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import lombok.Data;

@Data
@TableName("hello")
public class Hello {
    @TableId(type = IdType.AUTO)
    private Long id;
    private String msg;
}