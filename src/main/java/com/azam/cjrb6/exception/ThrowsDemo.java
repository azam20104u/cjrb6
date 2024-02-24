package com.azam.cjrb6.exception;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ThrowsDemo {
	public static void main(String[] args) {
		System.out.println("Program starts...");
		try {
			FileReader 	reader = new FileReader("C:\\Users\\AZAM ROG\\git\\repository\\cjrb6\\test.txt");
			System.out.println("Reading test file...");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		System.out.println("Program ends...");
	}
}
