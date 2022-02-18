package com.example.tencentcloudim.test;

import com.example.tencentcloudim.util.BeanMapUtils;
import com.example.tencentcloudim.util.RedisServiceUtil;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/**
 * @description:
 * @author: zyb
 * @date: 2021/6/11 16:04
 */
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class TestDemo01 {
    @Autowired
    private RedisServiceUtil redisServiceUtil;
    @Autowired
    private RedisTemplate redisTemplate;
    @Resource(name = "redisTwo")
    private RedisTemplate redisTemplateTwo;

    @Test
    public void redisConnectTest() {
        String testKey = "zhang:test:1";
        redisServiceUtil.set(testKey, "aaa");
        String result = redisServiceUtil.get(testKey);
        System.out.println("获取redis测试数据：" + result);
    }

    @Test
    public void redisIncrTest() throws Exception {
        String testKey = "zhang:test";
//        redisTemplate.opsForHash().put(testKey, "system", 1L);
//        redisTemplate.opsForHash().put(testKey, "order", 2L);
//        redisTemplate.opsForHash().put(testKey, "shop", 3L);
//        System.out.println(shop);
//        System.out.println(redisTemplate.opsForHash().values(testKey));
//        redisTemplate.expire(testKey, 10, TimeUnit.SECONDS);

//        Map<String, Object> map = new HashMap<>();
//        map.put("aaa", 1);
//        map.put("bbb", null);
//        map.put("ccc", null);
//        redisServiceUtil.hPutAll(testKey, map);
//        redisServiceUtil.hashIncrBy(testKey, "bbb", 12L);


        redisTemplate.opsForValue().set(testKey, "bbb");
        redisTemplateTwo.opsForValue().set(testKey, "ccc");
    }
}
