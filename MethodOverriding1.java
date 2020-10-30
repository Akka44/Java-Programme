class Car{
	void cost() {
		System.out.println("No cost");
	}
	void milage() {
		System.out.println("No milage");
	}
}
class Audi extends Car{
	void cost() {
		System.out.println("Audi cost is 50lac");
	}
	void milage() {
		System.out.println("Audi milage is 1okm");
	}
}
class Bmw extends Car{
	void cost() {
		System.out.println("Bmw cost is 41lac");
	}
	void milage() {
		System.out.println("Bmw milage is 12km");
	}
}
public class MethodOverriding1 {

	public static void main(String[] args) {
	     Car x=new Car();
	     x.cost();
	     x.milage();
	     
	     x=new Audi();
	     x.cost();
	     x.milage();
	     
	     x=new Bmw();
	     x.cost();
	     x.milage();
    
	}

}
