package com.example.tencentcloudim.test;

import com.example.tencentcloudim.util.RedisServiceUtil;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @description:
 * @author: zyb
 * @date: 2021/6/11 16:04
 */
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class TestDemo01 {
    @Autowired
    private RedisServiceUtil redisServiceUtil;

    @Test
    public void redisConnectTest(){
        String testKey = "zhang:test:1";
        redisServiceUtil.set(testKey, "aaa");
        String result = redisServiceUtil.get(testKey);
        System.out.println("获取redis测试数据：" + result);
    }
}
