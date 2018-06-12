package com.social.test.designModel.factory;

/**
 * Created by liufangrui on 2018/6/11.
 * 简单工厂模式
 */
public class SimpleFactory {

    public Human createHuman(String color){
        switch (color){
            case "黄种人":
                YellowHuman human1 = new YellowHuman();
                return  human1;
            case "白种人":
                WhiteHuman human2 = new WhiteHuman();
                return human2;
            case "黑种人":
                BlackHuman human3 = new BlackHuman();
                return human3;
            default:
                return null;
        }
    }
}
