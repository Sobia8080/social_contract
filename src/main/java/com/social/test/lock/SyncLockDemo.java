package com.social.test.lock;

/**
 * Created by liufangrui on 2018/6/8.
 */

class Threadsale implements Runnable{
    int tickets = 20;
    public void run(){
        while(true){
            if(tickets>0){
                System.out.println(Thread.currentThread().getName()+"售车票第"+tickets--+"号");
            }
            else
                System.exit(0);
        }
    }
}
public class SyncLockDemo {


    public static void main(String[] args){
        Threadsale t=new Threadsale();//实例化线程
        Thread t1=new Thread(t,"第1号售票窗口");
        Thread t2=new Thread(t,"第2号售票窗口");
        Thread t3=new Thread(t,"第3号售票窗口");
        Thread t4=new Thread(t,"第4号售票窗口");
        Thread t5=new Thread(t,"第5号售票窗口");
        Thread t6=new Thread(t,"第6号售票窗口");
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        t6.start();
    }
}