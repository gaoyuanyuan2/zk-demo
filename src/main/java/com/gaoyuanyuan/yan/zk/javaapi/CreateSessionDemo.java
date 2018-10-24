package com.gaoyuanyuan.yan.zk.javaapi;

import com.gaoyuanyuan.yan.zk.util.Constants;
import org.apache.zookeeper.Watcher;
import org.apache.zookeeper.ZooKeeper;

import java.util.concurrent.CountDownLatch;

/**
 * 腾讯课堂搜索 咕泡学院
 * 加群获取视频：608583947
 * 风骚的Michael 老师
 */
public class CreateSessionDemo {

    private static CountDownLatch countDownLatch=new CountDownLatch(1);

    public static void main(String[] args) throws Exception{
        connected();
    }

    public static void connected() throws Exception {
        ZooKeeper zooKeeper = new ZooKeeper(Constants.CONNECT_STRING,5000, watchedEvent->{
            if(watchedEvent.getState()== Watcher.Event.KeeperState.SyncConnected){
                countDownLatch.countDown();
                System.out.println(watchedEvent.getState());
            }
        });
        countDownLatch.await();
        System.out.println(zooKeeper.getState());
    }
}
