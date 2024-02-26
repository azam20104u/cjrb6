package com.azam.cjrb6.thread;

public class MyRunnable implements Runnable {//step 1 implement

	@Override
	public void run() {//step 2 override, task has assigned
		Thread thread = Thread.currentThread();//currently running thread object
		String name = thread.getName();
		for (int i = 1; i<=5; i++) {
			System.out.println(name+" is executing the Task: " + i);
		}
	}
}
