package com.social.test.designModel.singleton;

import java.util.concurrent.CountDownLatch;

/**
 * Created by liufangrui on 2018/6/11.
 */
public class SingletonCoundownLatchTest {

    private static final Integer MAX_THREAD_COUNT = 10;

    public static void main(String[] args) {
        //所有线程阻塞，然后统一开始
        final CountDownLatch begin = new CountDownLatch(1);

        for(int i = 0; i < MAX_THREAD_COUNT; i++){
            Thread thread = new Thread(new Runnable() {

                @Override
                public void run() {
                    try {
                        begin.await();
//                        LazySingleton singleton = LazySingleton.getInstanceSync();
                        HungrySingleton singleton = HungrySingleton.getInstance();
                        System.out.println(" 地址"+singleton);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                }
            });

            thread.start();
        }

        try {
            System.out.println("任务开始");
//            long start = System.currentTimeMillis();
            Thread.sleep(1000);
            begin.countDown();
//            long end = System.currentTimeMillis();
//            System.out.println("not sync use:"+(end-start));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
