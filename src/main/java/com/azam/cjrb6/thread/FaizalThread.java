package com.azam.cjrb6.thread;

public class FaizalThread extends Thread{
	Resource resource;
	String printThings;
    public FaizalThread(Resource resource, String printThings){
        this.resource = resource;
        this.printThings = printThings;
    }
    @Override
    public void run() {
    	resource.print(printThings);
    }
}
