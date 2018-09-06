package com.social.service.lock;

/**
 * Created by liufangrui on 2018/6/8.
 */
public interface LockService {
    //加锁
    boolean addLock();

    //解锁
    boolean releaseLock();

    boolean addZkLockApi();

    boolean releaseZkLockApi();

    boolean addZkClientLock();

    boolean releaseZkClientLock();

    boolean addZkCuratorLock();

    boolean releaseZkCuratorLock();

}
