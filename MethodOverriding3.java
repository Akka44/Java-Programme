class Person{
	public void home(){
		System.out.println("No home");
	}
	public void car(){
		System.out.println("No Car");
	}	
}
class Father extends Person{	
	public void home(){
		System.out.println("Father's home");
	}
	public void car(){
		System.out.println("Father's Car");
	}	
}
class Son extends Person{
	public void home(){
		System.out.println("son's home");
	}	
	public void car() {
		System.out.println("Son's Car");		
	}	
}
public class MethodOverriding3 {

	public static void main(String[] args) {
		
		Person person = new Person();
		person.home();
		person.car();
		
		person=new Father();
		person.home();
		person.car();
		
		person=new Son();
		person.home();
		person.car();
	}

}

