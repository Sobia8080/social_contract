package com.social.test.designModel.Model;

/**
 * Created by liufangrui on 2018/6/14.
 */
public class HummnerB extends HummerTemplate {
    @Override
    protected void start() {
        System.out.println("hummerB start");
    }

    @Override
    protected void stop() {
        System.out.println("hummerB stop");
    }

    @Override
    protected void alarm() {
        System.out.println("hummerB alarm");
    }

    protected boolean isAlarm() {
        return false;
    }
}
