package com.azam.cjrb6.thread;

public class RajdhaniExp extends Thread{
	String patri1;
	String patri2;
	public RajdhaniExp(String patri1, String patri2) {
        this.patri1 = patri1;
        this.patri2 = patri2;
	}
	@Override
	public void run() {
		synchronized (patri1) {
			System.out.println("RajdhaniExp is on " +patri1);
			synchronized (patri2) {
				System.out.println("RajdhaniExp is on " +patri2);
				System.out.println("RajdhaniExp's journy has Completed");
			}
		}
	}
}
