package com.azam.cjrb6.thread;

public class ShubhamThread2 extends Thread{
	Resource2 resource;
	String printThings;
    public ShubhamThread2(Resource2 resource, String printThings){
        this.resource = resource;
        this.printThings = printThings;
    }
    @Override
    public void run() {
    	try {
			resource.print(printThings);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
}
