interface Vehicle{
 void cost();
 void milage();
}

abstract class Car {
 void viper(){
  System.out.println("Car has two vipers");
 }
 void doors(){
  System.out.println("Car has 4 doors");
 }
}

abstract class Bike{
 void stand(){
  System.out.println("Bike has two stands");
 }
 void color() {
  System.out.println("Bike color is black");	 
 }
}

class Audi extends Car implements Vehicle{
 public void cost(){
  System.out.println("Audi cost is: 50lakhs");
 }
 public void milage(){
  System.out.println("Audi milage is: 10km");
 }
 public void capacity(){
  System.out.println("Audi capacity is: 5");
 }
}

class BMW extends Car implements Vehicle{
 public void cost(){
  System.out.println("BMW cost is: 40lakhs");
 }
 public void milage(){
  System.out.println("BMW milage is: 15km");
 }
 public void capacity(){
  System.out.println("BMW capacity is: 5");
 }
}

class Tvs extends Bike implements Vehicle{
 public void cost(){
  System.out.println("Tvs cost is: 43,000");
 }
 public void milage(){
  System.out.println("tvs milage is: 60km");
 }
 public void capacity(){
  System.out.println("Tvs capacity is: 2");
 }
}

class PassionPro extends Bike implements Vehicle{
 public void cost(){
  System.out.println("PassionPro cost is: 57,000");
 }
 public void milage(){
  System.out.println("PassionPro milage is: 65km");
 }
 public void capacity(){
  System.out.println("PassionPro capacity is: 2");
 }
}

public class Interface1 {
  public static void main(String[] args) {
    Audi audi = new Audi();
    audi.cost();
    audi.milage();
    audi.capacity();
    audi.viper();
    audi.doors();
    BMW bmw = new BMW();
    bmw.cost();
    bmw.milage();
    bmw.capacity();
    bmw.viper();
    bmw.doors();
    Tvs tvs= new Tvs();
    tvs.cost();
    tvs.milage();
    tvs.capacity();
    tvs.stand();
    PassionPro pro= new PassionPro();
    pro.cost();
    pro.milage();
    pro.capacity();
    pro.stand();
  }
}