package com.gary.utils;

import java.util.Random;

/**
 * Created by Guo on 2017/11/26.
 */
public class KeyUtil {
    /**
     * 生成唯一的主键
     * 格式：时间+随机数
     * @return
     */
    public static synchronized String genUniqueKey(){
        Random random=new Random();

        Integer number = random.nextInt(900000) + 100000;

        return  System.currentTimeMillis()+String.valueOf(number);
    }
}