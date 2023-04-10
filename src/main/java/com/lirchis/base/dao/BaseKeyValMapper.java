package com.lirchis.base.dao;

import com.lirchis.base.entity.BaseKeyVal;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface BaseKeyValMapper {
    @Select("select * from `base_key_val` where `key` = #{key}")
    BaseKeyVal selectByKey(@Param("key")String key);
}
