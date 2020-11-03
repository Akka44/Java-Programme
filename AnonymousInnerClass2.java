package com.ex;

abstract class Car{
	abstract void cost();
	abstract void milage();
}
public class AnonymousInnerClass2 {
	public static void main(String[] args) {
		Car x=new Car() {
			void cost() {
				System.out.println("Cost of car is 50 lac");
			}
			void milage() {
				System.out.println("mialge is 10km");
			}
		};
		x.cost();
		x.milage();
	}
}
