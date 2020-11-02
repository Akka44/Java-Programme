package com.factory;
abstract class Car{
	abstract void cost();
	abstract void milage();
}

class Audi extends Car{
	void cost() {
		System.out.println("Audi cost is 30lacs");
	}
	void milage() {
		System.out.println("Audi milage is 7km");
	}
}

class Bmw extends Car{
	void cost() {
		System.out.println("Bmw cost is 40 lacs");
	}
	void milage() {
		System.out.println("Bmw milage is 10km");
	}
}

class CarFactory{
    Car getCar(String carName) {
    	if(carName.equalsIgnoreCase("Audi")) {
    		return new Audi();
    	}
    	else if(carName.equalsIgnoreCase("Bmw")) {
    		return new Bmw();
    	}
    	else {
    		return null;
    	}
    }
}

public class DemoFactoryMethod {
	public static void main(String[] args) {
		CarFactory cf=new CarFactory();
		Car x=cf.getCar("Audi");
		x.cost();
		x.milage();
		
		System.out.println();
		
		x=cf.getCar("Bmw");
		x.cost();
		x.milage();
	}
}
