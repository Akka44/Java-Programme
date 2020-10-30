class Bike{
	void cost() {
		System.out.println("No cost");
	}
	void color() {
		System.out.println("No color");
	}
}
class HeroPassion extends Bike{
	void cost() {
		System.out.println("Hero passion cost is 57,000");
	}
	void color() {
		System.out.println("Hero passion color is light black");
	}
}
class HondaShine extends Bike{
	void cost() {
		System.out.println("Honda shine cost is 52,000");
	}
	void color() {
		System.out.println("Honda shine color is Dark Black");
	}
}
public class MethodOverriding2 {

	public static void main(String[] args) {
	     Bike x=new Bike();
	     x.cost();
	     x.color();
	     
	     x=new HeroPassion();
	     x.cost();
	     x.color();
	     
	     x=new HondaShine();
	     x.cost();
	     x.color();
    
	}

}