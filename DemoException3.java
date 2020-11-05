package com.exception;

public class DemoException3 {
    public static void main(String[] args) {
		String s1=null;
		String s2="akshay";
		try {
		   System.out.println(s1.equals(s2));
		}
		catch(NullPointerException e) {
			System.out.println("Exception thrown :"+e);
		}
	}
}
