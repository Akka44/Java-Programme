import java.util.Scanner;

class Mobile {
            String brandName;
            String mobileWidth;	
	    String mobileHeight;
	    String os;
	    int price;
}

public class MobileScanner
{
	public static void main(String[] args)
	{
		Mobile sam=new Mobile();
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter mobile Details");
		
                sam.brandName=sc.nextLine();
                sam.mobileWidth=sc.nextLine();	
	        sam.mobileHeight=sc.nextLine();
	        sam.os=sc.nextLine();
	        sam.price=sc.nextInt();;

	        System.out.println("============ Mobile details =============");
	        System.out.println("Mobile brand name is : " +sam.brandName);
	        System.out.println("Mobile Width is : " +sam.mobileWidth);
                System.out.println("Mobile Height is : " +sam.mobileHeight);
                System.out.println("Operating System  installed : " +sam.os);
	        System.out.println("Mobile cost is : " +sam.price);			
		
	}
}