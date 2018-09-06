package com.social.service.lock.impl;

import com.social.entity.bean.activity.LockConfig;
import com.social.mapper.activity.LockConfigMapper;
import com.social.service.lock.LockService;
import org.apache.curator.utils.ZookeeperFactory;
import org.apache.zookeeper.ZooKeeper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.concurrent.CountDownLatch;

/**
 * Created by liufangrui on 2018/6/8.
 */
@Service("mysqlLockService")
public class MysqlLockServiceImpl implements LockService{

    private static String CONNECTOR = "127.0.0.1:2181";

    private static int timeout = 5000;

    private CountDownLatch countDownLatch = new CountDownLatch(1);

    @Autowired
    private LockConfigMapper lockConfigMapper;

    @Override
    public boolean addLock() {
        LockConfig lock = new LockConfig();
        lock.setId(1);
        lock.setLockName("lock");
        Integer count = lockConfigMapper.insertSelective(lock);
        if(count == 1){
           return true;
        }
        return false;
    }

    @Override
    public boolean releaseLock() {
        Integer count = lockConfigMapper.deleteSelectiveOfId(1);
        if(count == 1){
            return true;
        }
       return  false;
    }

    @Override
    public boolean addZkLockApi() {
//        ZooKeeper zooKeeper = new ZooKeeper(CONNECTOR,timeout,new )


        return false;
    }

    @Override
    public boolean releaseZkLockApi() {
        return false;
    }

    @Override
    public boolean addZkClientLock() {
        return false;
    }

    @Override
    public boolean releaseZkClientLock() {
        return false;
    }

    @Override
    public boolean addZkCuratorLock() {
        return false;
    }

    @Override
    public boolean releaseZkCuratorLock() {
        return false;
    }
}
