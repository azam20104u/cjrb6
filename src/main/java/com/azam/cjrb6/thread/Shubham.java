package com.azam.cjrb6.thread;

public class Shubham extends Thread{
	private Account account;
	private double amount;
	public Shubham(Account account, double amount) {
		this.account = account;
        this.amount = amount;
	}
	@Override
    public void run() {
        account.widhraw(amount);
    }
}
