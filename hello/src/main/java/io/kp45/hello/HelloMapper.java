package io.kp45.hello;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Component;

@Component
public interface HelloMapper extends BaseMapper<Hello> {

    @Select("SELECT * FROM hello ORDER BY ID DESC LIMIT 1")
    Hello findLatest();

    @Update("UPDATE hello SET msg = #{msg} ORDER BY ID DESC LIMIT 1")
	void say(String msg);

}