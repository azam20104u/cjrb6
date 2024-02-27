package com.azam.cjrb6.thread;

public class SynchronizationDemo2 {
	public static void main(String[] args) {
		Resource2 resource = new Resource2();
		FaizalThread2 fThread = new FaizalThread2(resource,"CV");
		fThread.setName("faizal-thread");
		ShubhamThread2 sThread = new ShubhamThread2(resource,"Project");
		sThread.setName("shubham-thread");
		fThread.start();
		sThread.start();
	}
}
