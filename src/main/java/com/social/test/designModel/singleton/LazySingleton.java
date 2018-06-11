package com.social.test.designModel.singleton;

/**
 * Created by liufangrui on 2018/6/11.
 */
//懒汉式
public class LazySingleton {
    private static LazySingleton instance;

    private LazySingleton (){}//私有构造方法

    //通过公共的方式对外提供  通过public修饰
    public static LazySingleton getInstance() {
        if (instance == null) {
            //类本身要造一个  调用构造方法即可
            instance = new LazySingleton();
        }
        return instance;
    }
    //通过公共的方式对外提供  通过public修饰
    public static synchronized LazySingleton getInstanceSync() {
        if (instance == null) {
            //类本身要造一个  调用构造方法即可
            instance = new LazySingleton();
        }
        return instance;
    }

}