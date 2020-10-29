class Mobile {
            String brandName;
            String mobileWidth;	
	    String mobileHeight;
	    String os;
	    int price;
      
            Mobile(String brandName, String mobileWidth, String mobileHeight, String os, int price){
		this.brandName=brandName;
		this.mobileWidth=mobileWidth;
		this.mobileHeight=mobileHeight;
		this.os=os;
		this.price=price;
            }

	    void display(){
		System.out.println("mobile name="+brandName);
	        System.out.println("mobile width="+mobileWidth);
	        System.out.println("mobile height="+mobileHeight);
	        System.out.println("os installed="+os);
	        System.out.println("mobile price="+price);
            }
}

public class MobileConstructor
{
	public static void main(String[] args)
	{
		Mobile samsung=new Mobile("samsung","5cm","7cm","android",7000);
		samsung.display();
                
                Mobile apple=new Mobile("iphone 8","5.4cm","8cm","ios",70000);
		apple.display();
	}
}