package com.social.test.designModel.singleton;

import java.util.Calendar;

/**
 * Created by liufangrui on 2018/6/11.
 */
public class SingletonTest {
    public static void main(String[] args) {
//        Emperor emperor = Emperor.getInstance();
//        Emperor emperor = new Emperor("name","hah");
//        emperor.say();
//        Calendar calendar = Calendar.getInstance();
//        testLazySingleton();
        ThreadSingleton t=new ThreadSingleton();//实例化线程
		Thread t1=new Thread(t,"第1");
		Thread t2=new Thread(t,"第2");
		Thread t3=new Thread(t,"第3");
		Thread t4=new Thread(t,"第4");
		Thread t5=new Thread(t,"第5");
		Thread t6=new Thread(t,"第6");
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        t6.start();
    }


    private static void testLazySingleton(){
        LazySingleton singleton = LazySingleton.getInstance();
        System.out.println(singleton);
        LazySingleton singleton1 = LazySingleton.getInstance();
        System.out.println(singleton1);
    }
}

class ThreadSingleton implements Runnable{

    @Override
    public void run() {
        LazySingleton singleton = LazySingleton.getInstance();
        System.out.println(singleton);
    }
}