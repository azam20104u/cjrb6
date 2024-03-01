package com.azam.cjrb6.thread;

public class InterThreadComm {
	public static void main(String[] args) {
		Account account = new Account(0);
		Shubham th1 = new Shubham(account, 500);
		th1.setName("Shubham");
		Sister th2 = new Sister(account,500);
		th2.setName("Sister");
		th1.start();
		th2.start();
	}
}
