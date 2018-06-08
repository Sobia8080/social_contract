package com.social.test.designModel.proxy.myOwnProxy;

import java.lang.reflect.Method;

/**
 * Created by liufangrui on 2018/6/8.
 */
public interface LiuInvocationHandler {

    public Object invoke(Object proxy, Method method, Object[] args)
            throws Throwable;


}

