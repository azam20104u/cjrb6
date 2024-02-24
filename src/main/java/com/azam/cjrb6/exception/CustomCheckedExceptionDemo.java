package com.azam.cjrb6.exception;

public class CustomCheckedExceptionDemo {//Shubham's Code
	public static void main(String[] args) {
		System.out.println("Program starts...");
		try {
			FaizalForm form = new FaizalForm("");
		} catch (EmptyNameException e) {
			e.printStackTrace();
		}
		System.out.println("Program ends...");
	}
}
