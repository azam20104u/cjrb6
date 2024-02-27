package com.azam.cjrb6.thread;

public class RunnableThreadDemo {
	public static void main(String[] args) {
		Thread th1	= new Thread(new MyRunnable());//step 3, thread object created
		th1.setName("th1");
		th1.start();//step 4, thread started
//		Thread th2	= new Thread(new MyRunnable());//step 3, thread object created
//		th2.setName("th2");
//		th2.start();//step 4, thread started
	}
}
