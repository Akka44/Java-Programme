class Restuarant{
	void menu(){
		System.out.println("1.Idly 2.Dosa 3.Wada 4.Poori");
	}
        void takeOrder(String order){
                System.out.println("Order given is "+order);
	}
        String serveFood(){
               return "Dosa";
        }
        int giveBill(){
               return 421; 
	}
        String payBill(int amount){
	       System.out.println("Amount given is "+amount);
	       return "paid";
	}	
}
	
public class CustomerMethod{
    public static void main(String[] args){
	    Restuarant ohris=new Restuarant();
            ohris.menu();
            ohris.takeOrder("Dosa");
            System.out.println("Food served is "+ohris.serveFood());
	    System.out.println("Bill is "+ohris.giveBill());
	    System.out.println("Bill : "+ohris.payBill(421));
	}	
}	