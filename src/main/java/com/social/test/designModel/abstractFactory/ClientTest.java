package com.social.test.designModel.abstractFactory;

/**
 * Created by liufangrui on 2018/6/13.
 */
public class ClientTest {
    public static void main(String[] args) {
        AbstractCreator creator1 = new Creator1();
        AbstractCreator creator2 = new Creator2();

        AbstractProductA productA1 = creator1.createProductA();
        AbstractProductB productB1 = creator1.createProductB();

        AbstractProductA productA2 = creator2.createProductA();
        AbstractProductB productB2 = creator2.createProductB();

        System.out.println(productA1);
        System.out.println(productA2);
        System.out.println(productB1);
        System.out.println(productB2);
//        FatherClass father = new SunClass();
//        System.out.println(father);


    }
}
