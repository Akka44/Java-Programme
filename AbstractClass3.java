abstract class Shape{  
      abstract void draw();
      abstract void color();
      void sourceUsed() {
    	  System.out.println("colour full Pen");
      }
}  
class Rectangle extends Shape{
	  
      void draw() {
    	  System.out.println("drawing rectangle");
      }  
      void color() {
    	  System.out.println("color used to draw is Red");
      }
}  
class Circle1 extends Shape{  
	  void draw() {
		  System.out.println("drawing circle");
          }  
	  void color() {
		  System.out.println("color used to draw is Pink");
	  }
}    
public class AbstractClass3{  
      public static void main(String args[]){  
         Shape shape=new Circle1();  
         shape.draw();  
         shape.sourceUsed();
         shape.color();
         
         shape=new Rectangle();  
         shape.draw();  
         shape.sourceUsed();
         shape.color();
      }  
}  