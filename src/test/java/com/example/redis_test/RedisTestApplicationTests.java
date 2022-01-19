package com.example.redis_test;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;

import java.util.concurrent.TimeUnit;

@SpringBootTest()
class RedisTestApplicationTests {

    @Autowired
    private RedisTemplate<String,String> redisTemplate;

    @Test
    void redisTest() {
        String key = "GATEWAYSSOKEY";
        String hashKey = "ssoKey1";

//        redisTemplate.expire(key, 10,TimeUnit.SECONDS);
//        redisTemplate.opsForHash().put(key,hashKey,"123");

        String value = (String) redisTemplate.opsForHash().get(key,hashKey);
        System.out.println(value);

        Long timeout = redisTemplate.getExpire(key, TimeUnit.SECONDS);
        System.out.println(timeout);
    }
}
