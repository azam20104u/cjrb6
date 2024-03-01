package com.azam.cjrb6.thread;

public class Sister extends Thread{
	private Account account;
	private double amount;
	public Sister(Account account, double amount) {
		this.account = account;
        this.amount = amount;
	}
	@Override
    public void run() {
        account.deposit(amount);
    }
}
