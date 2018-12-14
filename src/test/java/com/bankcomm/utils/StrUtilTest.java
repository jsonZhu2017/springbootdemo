package com.bankcomm.utils;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

//@SpringBootTest
@RunWith(SpringJUnit4ClassRunner.class)
public class StrUtilTest {



    @Test
    public void test_checkIsMatchRegex(){
        StrUtil.checkIsMatchRegex("s44545","^[A-Za-z0-9_]{1,20}+$","不符合正则表达式");
    }
}
