package com.time;
class StaticBlock{
	static {
		System.out.println("Static Block");
	}
}
public class ForNameMethodExample {

	public static void main(String[] args) throws ClassNotFoundException {
		Class.forName("StaticBlock");
		System.out.println("ForName Method Executed");
	}
}

