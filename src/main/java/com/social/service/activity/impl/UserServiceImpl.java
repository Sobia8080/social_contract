package com.social.service.activity.impl;

import com.social.entity.User;
import com.social.service.UserService;
import org.springframework.stereotype.Service;

/**
 * Created by liufangrui on 2018/4/13.
 */
@Service("userService")
public class UserServiceImpl implements UserService {
    @Override
    public User getUser(String name) {
        User user = new User();
        user.setAge(10);
        user.setName(name);
        user.setRemark("单例模式");
        return user;
    }
}
