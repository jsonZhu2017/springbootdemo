package com.bankcomm.springbootdemo.utils;

public class StrUtil {

    /**
     * 校验字符串是否满足正则表达式
     * @param str
     * @param regex
     * @param errMsg
     */
    public static void checkIsMatchRegex(String str,String regex,String errMsg){
        if(!str.matches(regex)){
            throw new RuntimeException(errMsg);
        }
    }
}
