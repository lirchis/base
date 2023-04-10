package com.lirchis.base.mapper;

import com.lirchis.base.model.BaseKeyVal;
import com.lirchis.base.model.BaseKeyValExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BaseKeyValMapper {
    long countByExample(BaseKeyValExample example);

    int deleteByExample(BaseKeyValExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BaseKeyVal record);

    int insertSelective(BaseKeyVal record);

    List<BaseKeyVal> selectByExample(BaseKeyValExample example);

    BaseKeyVal selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BaseKeyVal record, @Param("example") BaseKeyValExample example);

    int updateByExample(@Param("record") BaseKeyVal record, @Param("example") BaseKeyValExample example);

    int updateByPrimaryKeySelective(BaseKeyVal record);

    int updateByPrimaryKey(BaseKeyVal record);
}