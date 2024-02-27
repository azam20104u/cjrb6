package com.azam.cjrb6.thread;

public class SynchronizationDemo {
	public static void main(String[] args) {
		Resource resource = new Resource();
		FaizalThread fThread = new FaizalThread(resource,"CV");
		fThread.setName("faizal-thread");
		fThread.setPriority(10);//after set priority there is no guarantee that this thread will run first.
		ShubhamThread sThread = new ShubhamThread(resource,"Project");
		sThread.setName("shubham-thread");
		fThread.start();
		sThread.start();
	}
}
