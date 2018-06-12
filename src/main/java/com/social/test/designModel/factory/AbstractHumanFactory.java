package com.social.test.designModel.factory;

/**
 * Created by liufangrui on 2018/6/11.\
 * abstract抽象类
 *
 */
public interface AbstractHumanFactory {

    public abstract <T extends Human> T createHuman(Class<T> c);
}
