package com.azam.cjrb6.thread;

public class ShubhamThread extends Thread{
	Resource resource;
	String printThings;
    public ShubhamThread(Resource resource, String printThings){
        this.resource = resource;
        this.printThings = printThings;
    }
    @Override
    public void run() {
    	resource.print(printThings);
    }
}
