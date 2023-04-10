package com.lirchis.base;


import com.lirchis.base.mapper.BaseKeyValMapper;
import com.lirchis.base.mapper.UserMapper;
import com.lirchis.base.model.BaseKeyVal;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class BaseApplicationTests {
    @Autowired
    UserMapper userMapper;
    @Autowired
    BaseKeyValMapper baseKeyValMapper;
    @Test
    void test(){
        System.out.println(userMapper.selectByPrimaryKey(1).toString());
        System.out.println(baseKeyValMapper.selectByPrimaryKey(1).toString());
    }
}
