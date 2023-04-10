package com.lirchis.base.service;

import com.lirchis.base.dao.BaseKeyValMapper;
import com.lirchis.base.entity.BaseKeyVal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BaseKeyValService {
    @Autowired
    BaseKeyValMapper baseKeyValMapper;

    public BaseKeyVal getByKey(String key){
        return baseKeyValMapper.selectByKey(key);
    }
}
