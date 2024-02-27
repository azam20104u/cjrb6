package com.azam.cjrb6.thread;

public class Resource {
	synchronized void print(String printingThings) {
		for (int i = 1; i <= 5; i++) {
			System.out.println(Thread.currentThread().getName()+" printing "+printingThings+" "+i);
			try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
		}
	}
}
