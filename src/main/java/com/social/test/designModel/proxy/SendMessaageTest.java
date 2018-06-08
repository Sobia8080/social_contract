package com.social.test.designModel.proxy;

import com.social.test.designModel.proxy.myOwnProxy.LiuMeiSender;
import sun.misc.ProxyGenerator;



/**
 * Created by liufangrui on 2018/6/8.
 */
public class SendMessaageTest {
    public static void main(String[] args) {
        Person person = (Person) new LiuMeiSender().getInstance(new Liufangrui());
        System.out.println(person.getClass());
        person.sendMessage();

        //获取字节码文件
//        ProxyGenerator.generateProxyClass("$Proxy0",new Class[]{Person.class});
    }
}
