package com.social.entity;

import java.io.Serializable;

/**
 * Created by liufangrui on 2018/4/13.
 */
public class User implements Serializable{

    private String name;

    private String remark;

    private Integer age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
