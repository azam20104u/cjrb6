package com.azam.cjrb6.thread;

public class ThreadDemo {
	public static void main(String[] args) {
		MyThread demo = new MyThread();//step 3
		demo.setName("th1");
		demo.start();//step 4
		
		MyThread demo2 = new MyThread();//step 3
		demo2.setName("th2");
		demo2.start();//step 4
	}
}
