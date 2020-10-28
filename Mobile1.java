class Mobile {
            String brandName;
            String mobileWidth;	
	    String mobileHeight;
	    String os;
	    int price;
}
public class Mobile1
{
	public static void main(String[] args)
	{
            Mobile sam=new Mobile();
            sam.brandName="samsung";
            sam.mobileWidth="6.98 cm";	
	    sam.mobileHeight="13.6 cm";
	    sam.os="Android";
	    sam.price=7888;

	    System.out.println("============ Mobile details =============");
	    System.out.println("Mobile brand name is : " +sam.brandName);
	    System.out.println("Mobile Width is : " +sam.mobileWidth);
            System.out.println("Mobile Height is : " +sam.mobileHeight);
            System.out.println("Operating System  installed : " +sam.os);
	    System.out.println("Mobile cost is : " +sam.price);			
		
	}
}