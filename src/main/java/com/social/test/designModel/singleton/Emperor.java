package com.social.test.designModel.singleton;

/**
 * Created by liufangrui on 2018/6/11.
 */
public class Emperor {

    private String name;

    private String reamrk;

    private static final Emperor emperor = new Emperor("James","King");//初始化一个对象

    private Emperor(String name,String reamrk){
        this.name = name+"111";
        this.reamrk = reamrk+"===";
    }

    public static Emperor getInstance(){
        return emperor;
    }

    public void say(){
        System.out.println(this.name+"say"+this.reamrk+"...");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getReamrk() {
        return reamrk;
    }

    public void setReamrk(String reamrk) {
        this.reamrk = reamrk;
    }
}
