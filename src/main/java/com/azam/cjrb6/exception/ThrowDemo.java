package com.azam.cjrb6.exception;

public class ThrowDemo {
	static String name;
	static int age;
	static void formFill(String inputName, int inputAge) {
		name=inputName;
		age=inputAge;
		System.out.println(name + " your form has been submitted successfully");
	}
	static void validate() {
		if(age < 17) {
			//System.out.println("Age is not valid: " + age);//without throwing any exception
			//throw new IllegalStateException("Age is not valid: " + age);//explicitly throw an exception
			throw new AgeNotValideException("Age is not valid: " + age);//throw Custom Exception
        }else {
        	System.out.println("Age is valid: " + age);
        }
	}
	static void generateLicense() {
        System.out.println(name+" your license is ready, it is being generated");
    }
	public static void main(String[] args) {
		System.out.println("Welcome to License Generate System...");
		formFill("Ravi", 16);
		validate();
		generateLicense();
		System.out.println("Thank you visit again...");
	}
}
