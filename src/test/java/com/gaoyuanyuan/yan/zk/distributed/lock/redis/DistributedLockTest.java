package com.gaoyuanyuan.yan.zk.distributed.lock.redis;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class DistributedLockTest {

    @Autowired
    private DistributedLock distributedLock;

    @Test
    public void tryLock() {
        System.out.println(distributedLock.tryLock("123",10000));
    }

    @Test
    public void tryLock1() {
    }

    @Test
    public void unlock() {
        distributedLock.unlock("123");
    }

    @Test
    public void longToBytes() {
    }

    @Test
    public void bytesToLong() {
    }
}