interface Electronics{
 void cost();
 void ram();
}

abstract class Laptop {
 void keybord(){
  System.out.println("Laptop has Keybord");
 }
 void mouse(){
  System.out.println("Laptop has mouse");
 }
 void webcam(){
  System.out.println("Laptop has Webcam");
 }
}

abstract class Mobile{
 void camera(){
  System.out.println("Mobile has rare and front cameras");
 }
}

class Dell extends Laptop implements Electronics{
 public void cost(){
  System.out.println("Dell cost is: 50000");
 }
 public void ram(){
  System.out.println("Dell ram is: 4GB");
 }
}

class Lenovo extends Laptop implements Electronics{ 
 public void cost(){
  System.out.println("Lenovo cost is: 45000");
 }
 public void ram(){
  System.out.println("Lenovo ram is: 6GB");
 }
}

class Mi extends Mobile implements Electronics{
 public void cost(){
  System.out.println("Mi cost is: 7000");
 }
 public void ram(){
  System.out.println("Redmi ram is: 4GB");
 }
}

class Oppo extends Mobile implements Electronics{
 public void cost(){
  System.out.println("Oneplus cost is: 45000");
 }
 public void ram(){
  System.out.println("Oneplus ram is: 8GB");
 }
}

public class Interface3 {
  public static void main(String[] args) {
    Dell dell=new Dell();
    dell.cost();
    dell.ram();
    dell.keybord();
    dell.mouse();
    dell.webcam();
    Lenovo lenovo=new Lenovo();
    lenovo.cost();
    lenovo.ram();
    Mi mi=new Mi();
    mi.cost();
    mi.ram();
    mi.camera();
    
    Oppo oppo=new Oppo();
    oppo.cost();
    oppo.ram(); 
    oppo.camera();
  }
}