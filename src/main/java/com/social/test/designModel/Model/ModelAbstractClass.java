package com.social.test.designModel.Model;

/**
 * Created by liufangrui on 2018/6/14.
 */
public abstract class ModelAbstractClass {

    //基本方法
    protected void doAnything(){}

    //基本方法
    protected void doSomething(){}

    public void templateMethod(){
        this.doAnything();
        this.doSomething();
    }

}
