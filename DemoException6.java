package com.exception;

public class DemoException6 {
	static void validate(int age) {
	    if(age<18) {
	    	throw new ArithmeticException();
	    }
	    else {
	    	System.out.println("Welcome to vote");
	    }
	}
	public static void main(String[] args) {
		try {
		  validate(13);
		}
		catch(ArithmeticException e) {
			System.out.println("Exception thrown: "+e);
		}
		finally {
	      System.out.println("rest of the code...");
		}  
	}
}
