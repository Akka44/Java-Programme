package com.time;

public class StaticBlockExample2 {
	public static void main(String[] args) {
		System.out.println("Main Block");
	}
	static {
		System.out.println("Static Block");
	}
}
