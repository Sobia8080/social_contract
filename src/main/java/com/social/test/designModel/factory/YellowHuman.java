package com.social.test.designModel.factory;

/**
 * Created by liufangrui on 2018/6/11.
 */
public class YellowHuman implements Human{

    private String color="黄种人";

    private String area="亚洲";

    @Override
    public String getColor() {
        System.out.println("我是："+color+";我来自："+area);
        return color;
    }

    @Override
    public String getArea() {
        System.out.println("我来自："+area+";我是："+color);
        return area;
    }
}
