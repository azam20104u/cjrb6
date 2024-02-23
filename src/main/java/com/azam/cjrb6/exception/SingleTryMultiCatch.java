package com.azam.cjrb6.exception;
//If you have to perform different tasks at the occurrence of different Exceptions, use java multi catch block.
public class SingleTryMultiCatch {
	public static void main(String[] args) {
		System.out.println("Program starts...");
		int result = 0;
		try {
			result = 10 / 5;//throw new ArithmeticException();
			System.out.println(result);
			int[] array = new int[result];
			array[4] = 100;//throw new ArrayIndexOutOfBoundsException();
			System.out.println(array[4]);
			String str = null;
			str = str.concat("Azam");
			System.out.println(str);
		} catch (ArithmeticException e) {//order should be most specific exception
			System.out.println("Boss there is a problem with arithmetic operations");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("There is a problem with array index out of bounds");
		} catch (Exception e) {//to the most General exception
			System.out.println("General Exception");
		}
		System.out.println("Program end...");
	}
}
