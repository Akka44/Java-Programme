class Dog extends Animal{
	 
   Dog(int weight){
	   System.out.println("weight of Dog is "+weight+"kg");
   }
	
   public void sound(){
	 System.out.println("Woof");
   }
   public void height() {
	   System.out.println("55 cm");
   }
}
public class AbstractClass2{
   public static void main(String args[]){
	 Animal animal = new Dog(25);
	 animal.sound();
	 animal.height();
   }
}