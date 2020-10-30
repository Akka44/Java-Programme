abstract class Car{
	abstract void cost();
	abstract void milage();
	void start() {
		System.out.println("starts with a key");
	}
	
}
class Audi extends Car{
	Audi(int no_of_seats){
		System.out.println("number of seats are "+no_of_seats);
	}
    void cost() {
    	System.out.println("Audi cost is 50 lac");
    }
    void milage() {
    	System.out.println("Audi milage is 10 km");
    }
}
class Bmw extends Car{
	Bmw(int no_of_seats){
		System.out.println("number of seats are "+no_of_seats);
	}
    void cost() {
    	System.out.println("Bmw cost is 45 lac");
    }
    void milage() {
    	System.out.println("Bmw milage is 9 km");
    }
}

public class AbstarctClass1{
	public static void main(String[] args) {
		Car car=new Audi(5);
		car.start();
		car.cost();
		car.milage();
		
		car=new Bmw(4);
		car.start();
		car.cost();
		car.milage();
	}
}