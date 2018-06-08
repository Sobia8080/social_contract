package com.social.test.designModel.proxy.myOwnProxy;

import com.social.test.designModel.proxy.Person;

import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created by liufangrui on 2018/6/8.
 */
public class LiuMeiSender implements LiuInvocationHandler{

    private Person person;

    public Object getInstance(Person target){
        this.person = target;
        Class clazz = target.getClass();
//        return LiuProxy.newProxyInstance(clazz.getClassLoader(),clazz.getInterfaces(),this);
        return LiuProxy.newProxyInstance(new LiuClassLoader(),clazz.getInterfaces(),this);
    }


    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        return null;
    }
}
