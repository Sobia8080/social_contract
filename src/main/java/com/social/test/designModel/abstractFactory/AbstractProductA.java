package com.social.test.designModel.abstractFactory;

/**
 * Created by liufangrui on 2018/6/13.
 * 抽象产品类
 */
public abstract class AbstractProductA {

    //每个产品有公用的方法
    public void shareMethod(){}

    //每个产品有共同的方法，不同的实现
    public abstract void doSomething();

}
