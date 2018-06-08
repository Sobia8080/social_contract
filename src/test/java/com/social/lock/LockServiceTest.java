package com.social.lock;

import com.social.service.lock.LockService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest
public class LockServiceTest {
	@Resource(name = "mysqlLockService")
	LockService lockService;


	@Test
	public void contextLoads() {
		lockService.addLock();

//		Threadsale t=new Threadsale();//实例化线程
//		Thread t1=new Thread(t,"第1号售票窗口");
//		Thread t2=new Thread(t,"第2号售票窗口");
//		Thread t3=new Thread(t,"第3号售票窗口");
//		Thread t4=new Thread(t,"第4号售票窗口");
//
//		t1.start();
//		t2.start();
//		t3.start();
//		t4.start();
	}

}

class Threadsale implements Runnable{
	int tickets = 20;
	public void run(){
//		lockService.addLock();
//		while(true){
//			if(tickets>0){
//				if(lockService.addLock()){
//					System.out.println(Thread.currentThread().getName()+"售车票第"+tickets--+"号");
//					lockService.releaseLock();
//				}
//				try {
//					Thread.currentThread().wait();
//				} catch (InterruptedException e) {
//					e.printStackTrace();
//				}
//			}
//			else
//				System.exit(0);
//		}
	}
}
