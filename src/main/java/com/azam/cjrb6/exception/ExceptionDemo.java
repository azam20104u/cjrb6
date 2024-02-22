package com.azam.cjrb6.exception;

import java.util.Scanner;

public class ExceptionDemo {//Unchecked or Runtime Exception
	public static void main(String[] args) {
		System.out.println("Program starts...");
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter 1st number: ");
		int number1 = scanner.nextInt();
		System.out.print("Enter 2nd number: ");
		int number2 = scanner.nextInt();
		try {
			int result = number1/number2;
			System.out.println(result);
		}catch (ArithmeticException e) {
			e.printStackTrace();
		}
		System.out.println("Program finished...");
	}
}
