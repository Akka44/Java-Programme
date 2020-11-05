package com.exception;

public class DemoString1 {
	public static void main(String[] args) {
		String s="Sachin";  
		String s1=s.concat(" Tendulkar");  
		System.out.println(s1);
		System.out.println(s.equals(s1));
		String s2="Sachin Tendulkar";
		System.out.println(s1.equals(s2));
		String s3=new String("Sachin Tendulkar");
		System.out.println(s2==s3);
		System.out.println(s1==s2);
		
		String s4="Sachin";
		String s5="Sachin";
		String s6="Ratan";
		
		String s7="AKSHAY";
		String s8=" tendulkar";
		
		System.out.println(s4.compareTo(s5));
		System.out.println(s4.compareTo(s6));	
		System.out.println(s6.compareTo(s4));
		System.out.println(s2.substring(2,6));
		
		System.out.println(s2.toUpperCase());
		System.out.println(s7.toLowerCase());
		
		System.out.println(s8.trim());
		
	}
}
