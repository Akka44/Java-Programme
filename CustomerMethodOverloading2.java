class Laptop {
	void menu(){
		System.out.println("1.HP 2.DELL 3.LENOVO 4.ASUS ");
	}
        void takeOrder(String order){
                System.out.println("Order given is "+order);
	}
	void takeOrder(String order1, String order2){
                System.out.println("Order given is "+order1+"and "+order2);
	}
	void takeOrder(String order1, String order2, String order3){
                System.out.println("Order given is "+order1+", "+order2+"and "+order3);
	}
        
}
	
public class CustomerMethodOverloading2{
    public static void main(String[] args){
	    Laptop dell=new Laptop();
            dell.menu();
            dell.takeOrder("DELL");
	    dell.takeOrder("DELL","ASUS");
            dell.takeOrder("DELL","HP", "LENOVO");

	}	
}	