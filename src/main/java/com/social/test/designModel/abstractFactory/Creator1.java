package com.social.test.designModel.abstractFactory;

/**
 * Created by liufangrui on 2018/6/13.
 */
public class Creator1 extends AbstractCreator{

    //只生产A1
    @Override
    public AbstractProductA createProductA() {
        return new ProductA1();
    }
    //只生产B1
    @Override
    public AbstractProductB createProductB() {
        return new ProductB1();
    }
}
