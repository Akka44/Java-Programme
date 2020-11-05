package com.exception;

public class DemoException4 {
	public static void main(String[] args) {
	     String s="123.45";
	     try {
	       System.out.println(Integer.parseInt(s));
	     }
	     catch(NumberFormatException e) {
	    	 System.out.println("Exception thrown: "+e);
	     }
	}
}
