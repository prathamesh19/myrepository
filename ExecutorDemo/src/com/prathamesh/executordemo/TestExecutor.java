package com.prathamesh.executordemo;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class TestExecutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a =new A();
		Thread t1=new Thread(a,"Thread A1");
		Thread t2 =new Thread(a,"Thread A2");
		t1.start();
	     ScheduledExecutorService threadPool=Executors.newScheduledThreadPool(5);
	     threadPool.scheduleAtFixedRate(t1, 2,5 , TimeUnit.SECONDS);
	}

}

class A implements Runnable{

	@Override
	public void run() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// TODO Auto-generated method stub
		for(int i=0;i<5;i++){
			System.out.print("\n" + i);
		}
		
	}
	
}
