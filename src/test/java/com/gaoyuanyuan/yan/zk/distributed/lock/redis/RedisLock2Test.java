package com.gaoyuanyuan.yan.zk.distributed.lock.redis;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class RedisLock2Test {

    @Autowired
    StringRedisTemplate stringRedisTemplate;

    @Test
    public void tryLock() {
        RedisLock2 lock2 = new RedisLock2(stringRedisTemplate,"1234");
        System.out.println(lock2.tryLock(100));
        lock2.unlock();

    }

    @Test
    public void unlock() {

    }
}