package com.social.test.designModel.Model;

/**
 * Created by liufangrui on 2018/6/14.
 */
public class HummnerA extends HummerTemplate{
    @Override
    protected void start() {
        System.out.println("hummerA start");
    }

    @Override
    protected void stop() {
        System.out.println("hummerA stop");
    }

    @Override
    protected void alarm() {
        System.out.println("hummerA alarm");
    }

    protected boolean isAlarm() {
        return true;
    }
}
