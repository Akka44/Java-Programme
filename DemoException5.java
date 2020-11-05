package com.exception;
class InvalidAgeException extends Exception{
	InvalidAgeException(String s){
		 super(s);
	 }
}
public class DemoException5 {
	static void validate(int age) throws InvalidAgeException {
		if(age<18) {
			throw new InvalidAgeException("not valid");
		}
		else {
			System.out.println("welcome to vote");
		}
	}
	public static void main(String[] args) {
		try {
			validate(13);
		}
		catch(InvalidAgeException e) {
			System.out.println("Exception thrown: "+e);
		}
	}
}
