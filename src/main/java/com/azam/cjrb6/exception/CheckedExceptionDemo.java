package com.azam.cjrb6.exception;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class CheckedExceptionDemo {
	public static void main(String[] args) {
		System.out.println("Program starts...");
		try {
			FileReader file = new FileReader("C:\\Users\\AZAM ROG\\git\\repository\\cjrb6\\test.txt");
			System.out.println("File is being read");
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		System.out.println("Program end...");
	}
}
