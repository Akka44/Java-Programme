class Restuarant{
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
	
public class CustomerMethodOverloading{
    public static void main(String[] args){
	    Restuarant ohris=new Restuarant();
            ohris.takeOrder("Dosa");
            ohris.takeOrder("Dosa","poori");
            ohris.takeOrder("Dosa","poori","Idli");
            
	}	
}	