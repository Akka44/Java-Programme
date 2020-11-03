package com.ex;

abstract class Person{
	abstract void eat();
}
public class AnonymousInnerClass1 {
	public static void main(String[] args) {
		new Person(){
			void eat() {
				System.out.println("Eating ice cream");
			}
		}.eat();
	}
}
