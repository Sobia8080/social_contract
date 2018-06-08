package com.social.test.designModel.proxy;

/**
 * Created by liufangrui on 2018/6/8.
 */
public class Liufangrui implements Person{

    private String sex = "男";

    private String name = "liufangrui";

    @Override
    public void sendMessage() {
        System.out.println("first remark");
        System.out.println("second remark");
        System.out.println("third remark");
        System.out.println(sex+"---"+name);
    }

    @Override
    public void sendOldMessage() {
        System.out.println("old first remark");
        System.out.println("old second remark");
        System.out.println("old third remark");
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
