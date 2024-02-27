package com.azam.cjrb6.thread;

public class Resource2 {
	 void print(String printingThings) throws InterruptedException {
		 System.out.println(Thread.currentThread().getName()+" printing "+printingThings+" "+1);
		 Thread.sleep(500);
		 synchronized (this) {
			 System.out.println(Thread.currentThread().getName()+" printing "+printingThings+" "+2);
			 Thread.sleep(500);
			 System.out.println(Thread.currentThread().getName()+" printing "+printingThings+" "+3);
			 Thread.sleep(500);
			 System.out.println(Thread.currentThread().getName()+" printing "+printingThings+" "+4);
			 Thread.sleep(500);
		}
		 System.out.println(Thread.currentThread().getName()+" printing "+printingThings+" "+5);
		 Thread.sleep(500);
	}
}
