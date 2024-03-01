package com.azam.cjrb6.thread;

public class PunjabExp extends Thread{
	String patri1;
	String patri2;
	public PunjabExp(String patri1, String patri2) {
        this.patri1 = patri1;
        this.patri2 = patri2;
	}
	//===============if follow this order then definitely we will get dead lock situation============
//	@Override
//	public void run() {
//		synchronized (patri2) {
//			System.out.println("PunjabExp is on " +patri2);
//			synchronized (patri1) {
//				System.out.println("PubjabExp is on " +patri1);
//				System.out.println("PunjabExp's journy has Completed");
//			}
//		}
//	}
	//===============if change the order then we can overcome dead lock situation============
	@Override
	public void run() {
		synchronized (patri1) {
			System.out.println("PunjabExp is on " +patri1);
			synchronized (patri2) {
				System.out.println("PubjabExp is on " +patri2);
				System.out.println("PunjabExp's journy has Completed");
			}
		}
	}
}
