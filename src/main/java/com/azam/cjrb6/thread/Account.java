package com.azam.cjrb6.thread;

public class Account {
	private double balance;
	public Account(double balance){
		this.balance = balance;
	}
	public double getBalance(){
        return balance;
    }
	public synchronized void widhraw(double amount){
		String name = Thread.currentThread().getName();
		if(balance<amount){
			System.out.println(name + " please wait, you don't have sufficient balance, let sister deposit first.");
			try { wait(); } catch (InterruptedException e) { e.printStackTrace(); }
		}
        balance -= amount;
        System.out.println(name+" after withdraw, balance: " + balance);
    }
	public synchronized void deposit(double amount){
		String name = Thread.currentThread().getName();
        balance+= amount;
        System.out.println(name+" after deposit, balance: " + balance);
        System.out.println(name+" deposit successful, Now Shubham can withdraw");
        notifyAll();
    }
}
