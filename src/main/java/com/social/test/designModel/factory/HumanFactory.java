package com.social.test.designModel.factory;

/**
 * Created by liufangrui on 2018/6/11.
 */
public class HumanFactory implements AbstractHumanFactory{

    @Override
    public <T extends Human> T createHuman(Class<T> c) {
        Human human = null;
        try {
            human = (T)Class.forName(c.getName()).newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return (T) human;
    }
}
