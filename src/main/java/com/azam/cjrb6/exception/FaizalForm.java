package com.azam.cjrb6.exception;

public class FaizalForm {
	public FaizalForm(String name) throws EmptyNameException{
		if (name.isEmpty()) {
			throw new EmptyNameException("Name must not be empty");
		} else {
            System.out.println(name+" is valid, application is procceded");
		}
	}
}
