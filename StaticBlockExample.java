package com.time;

class StaticDemo{
	static {
		System.out.println("Get Name Static block");
	}
	StaticDemo(){
		System.out.println("Get Name Constructor");
	}
}
public class StaticBlockExample {

	public static void main(String[] args) {
		StaticDemo sd=new StaticDemo();
	}
}
