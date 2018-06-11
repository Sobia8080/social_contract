package com.social.test.designModel.proxy;

/**
 * Created by liufangrui on 2018/6/8.
 */
public class Liufangrui implements Person{

    private String sex = "男";

    private String name = "liufangrui";

    @Override
    public void sendMessage() {
        System.out.println("first 单例模式");
        System.out.println("second 单例模式");
        System.out.println("third 单例模式");
        System.out.println(sex+"---"+name);
    }

    @Override
    public void sendOldMessage() {
        System.out.println("old first 单例模式");
        System.out.println("old second 单例模式");
        System.out.println("old third 单例模式");
        System.out.println(sex+"-- old --"+name);
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
