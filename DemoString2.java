package com.exception;

public class DemoString2 {
	public static void main(String[] args) {
		StringBuilder sb=new StringBuilder("Akshay");
		sb.append("sharma");
		System.out.println(sb);
		System.out.println(sb.reverse());
		System.out.println(sb.delete(1,3));
		System.out.println(sb.replace(1,4, "hhhs"));
	}
}
