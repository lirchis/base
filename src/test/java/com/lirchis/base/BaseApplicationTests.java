package com.lirchis.base;

import com.lirchis.base.entity.BaseKeyVal;
import com.lirchis.base.service.BaseKeyValService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class BaseApplicationTests {
    @Autowired
    BaseKeyValService baseKeyValService;
    @Test
    void contextLoads() {
        String key = "a";
        BaseKeyVal baseKeyVal = baseKeyValService.getByKey(key);
        System.out.println(baseKeyVal.getVal());
    }

}
