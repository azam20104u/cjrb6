package com.azam.cjrb6.exception;

public class FinallyBlock {
	public static void main(String[] args) {
		System.out.println("Program starts...");
		int result = 0;
		try {
			result = 10 / 2;//throw new ArithmeticException();
			System.out.println(result);
			int[] array = new int[result];
			array[4] = 100;//throw new ArrayIndexOutOfBoundsException();
			System.out.println(array[4]);
			String str = "str";
			System.out.println(str.concat("ddd"));
		} catch (ArithmeticException e) {//order should be most specific exception
			System.out.println("Boss there is a problem with arithmetic operations");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("There is a problem with array index out of bounds");
		}finally {//it will execute at any cost. Note: only fatal error or if you call System.exit(0) before this block;
			System.out.println("Important code");//close the  jdbc connection, stream or any costly resource			
		}
		System.out.println("Program end...");
	}
}
