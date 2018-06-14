package com.social.test.designModel.Model;

/**
 * Created by liufangrui on 2018/6/14.
 */
public abstract class HummerTemplate {

    protected abstract void start();
    protected abstract void stop();
    protected abstract void alarm();


    final public void run(){
        this.start();
        if(this.isAlarm()){
            this.alarm();
        }
        this.stop();
    }

    protected boolean isAlarm() {
        return false;
    }

}
