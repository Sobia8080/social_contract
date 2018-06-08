package com.social.test.designModel.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created by liufangrui on 2018/6/8.
 */

//继承这个接口有代理功能
public class MeiMessageSender implements InvocationHandler{

    private Person person;

    public Object getInstance(Person target){
        this.person = target;
        Class clazz = target.getClass();
        return Proxy.newProxyInstance(clazz.getClassLoader(),clazz.getInterfaces(),this);
    }


    /**
     * 原理
     * 1、拿到被代理的想的引用然后获取它的接口
     * 2、JDK代理重新生成一个类，同时实现我们代理对象所实现的接口
     * 3、把被代理对象的引用也拿到
     * 4、重新动态生成一个class字节码
     * 5、然后编译
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("筛选");
        System.out.println("代理人名称"+this.person.getName()+"代理人性别"+this.person.getSex());
        method.invoke(this.person,args);
//        this.person.sendMessage();
        System.out.println("----------------------");
//        this.person.sendOldMessage();

        System.out.println("代理成功");
        return null;
    }
}
