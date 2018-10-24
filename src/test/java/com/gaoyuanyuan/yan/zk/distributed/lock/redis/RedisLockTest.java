package com.gaoyuanyuan.yan.zk.distributed.lock.redis;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class RedisLockTest {

    @Autowired
    private RedisLock redisLock;

    @Test
    public void tryLock() {
        System.out.println(redisLock.tryLock(60,"123"));
    }

    @Test
    public void unlock() {
        redisLock.unlock("123");
    }
}