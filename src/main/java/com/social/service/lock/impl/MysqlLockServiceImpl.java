package com.social.service.lock.impl;

import com.social.entity.bean.activity.LockConfig;
import com.social.mapper.activity.LockConfigMapper;
import com.social.service.lock.LockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by liufangrui on 2018/6/8.
 */
@Service("mysqlLockService")
public class MysqlLockServiceImpl implements LockService{

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
}
