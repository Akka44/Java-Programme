class Laptop {
	void menu(){
		System.out.println("1.HP 2.DELL 3.LENOVO 4.ASUS ");
	}
        void takeOrder(String order){
                System.out.println("Order given is "+order);
	}
        String orderPlaced(){
                return "DELL";
        }
        int giveBill(){
                return 40000; 
	}
	int offer(){
	        return 4;
	}	
        String payBill(int amount){
		System.out.println("Amount given is "+amount);
		return "paid";
	}	
}
	
public class CustomerMethod2{
    public static void main(String[] args){
	    Laptop dell=new Laptop();
            dell.menu();
            dell.takeOrder("DELL");
            System.out.println(" served is "+dell.orderPlaced());
	    System.out.println("Bill is "+dell.giveBill());
	    System.out.println("offer is of "+dell.offer()+"%");
            System.out.println("Bill : "+dell.payBill(38400));
	}	
}	