package com.azam.cjrb6.thread;

public class DeadLockDemo {
	public static void main(String[] args) {
		final String patri1 = "Patri 1";
		final String patri2 = "Patri 2";
		RajdhaniExp rExp = new RajdhaniExp(patri1, patri2);
		PunjabExp pExp = new PunjabExp(patri1, patri2);
		rExp.start();
		pExp.start();
	}
}
