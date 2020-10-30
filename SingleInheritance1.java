import java.util.Scanner;
class MobilePhone{	  			
	void brandName(String brandName){
	    System.out.println("Name of Mobile "+brandName);
	}
	void weight(int weight){
	    System.out.println("Wieight of mobile "+weight);
	}
	           
}
class OnePlus extends MobilePhone{
	void cost(Long cost){
	    System.out.println("cost of mobile "+cost);
	}		
}
public class SingleInheritance{
        public static void main(String[] args){
	     Scanner sc=new Scanner(System.in);
         
	     OnePlus oneplus=new OnePlus();
             System.out.println("Enter the details");
	     String name=sc.nextLine();
	     int wt=sc.nextInt();	     
	     Long price=sc.nextLong();
	     
	     oneplus.brandName(name);
	     oneplus.weight(wt);
	     oneplus.cost(price);
        }
}
	       