class Animal{ 
	void eat()
    {
		System.out.println("eating...");  
    }  
}
class Dog extends Animal
{  
    void bark()
    {
	    System.out.println("barking...");  
    }
}
class Cat extends Animal{  
    void meow()
    {
    	System.out.println("meowing...");  
    }
}
public class HierarichalInheritance{  
     public static void main(String args[]){
    	 
    	Dog dog=new Dog();
    	dog.eat();
    	dog.bark();
    	 
        Cat cat=new Cat();  
        cat.meow();  
        cat.eat();
                
     } 
}  