package com.social.test.designModel.abstractFactory;

/**
 * Created by liufangrui on 2018/6/13.
 * 抽象工厂
 */
public abstract class AbstractCreator {

    //创建产品A
    public abstract AbstractProductA createProductA();
    //创建产品B
    public abstract AbstractProductB createProductB();
}
