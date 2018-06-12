package com.social.test.designModel.factory;

/**
 * Created by liufangrui on 2018/6/11.
 * 工厂测试类
 */
public class FactoryTest {

    public static void main(String[] args) {
//        String color = "黄种人";
//        Human human = createHuman(color);
//        human.getArea();
//        human.getColor();
        HumanFactory humanFactory = new HumanFactory();
        BlackHuman human = humanFactory.createHuman(BlackHuman.class);
        human.getArea();
        human.getColor();
    }

    public static Human createHuman(String color){
        SimpleFactory simpleFactory = new SimpleFactory();
        return simpleFactory.createHuman(color);
    }

//    public static Human createHumanByClass(Class clazz){
//        HumanFactory humanFactory = new HumanFactory();
//        return humanFactory.createHuman(clazz);
//    }
}
