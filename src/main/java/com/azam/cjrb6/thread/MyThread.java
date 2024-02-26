package com.azam.cjrb6.thread;

public class MyThread extends Thread{//step 1
	@Override
	public void run() {//step 2
		Thread thread = Thread.currentThread();//currently running thread object
		String name = thread.getName();
		for (int i = 1; i<=5; i++) {
			System.out.println(name+" is executing the Task: " + i);
		}
	}
}
