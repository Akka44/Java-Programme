package com.exception;

public class DemoException2 {

	public static void main(String[] args) {
	   try {	
		int x=2/0;
	   }
	   catch(ArithmeticException e) {
		   System.out.println("Exception thrown :"+e);
	   }
	}
}
