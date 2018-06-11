package com.social.test.designModel.singleton;

/**
 * Created by liufangrui on 2018/6/11.
 */
public class HungrySingleton {

    private static HungrySingleton singleton = new HungrySingleton();

    private HungrySingleton(){}

    public static HungrySingleton getInstance(){
        return singleton;
    }
}
