interface Bank{  
      float rateOfInterest();  
}  
class SBI implements Bank{  
      public float rateOfInterest(){
    	  return 9.15f;
      }  
}  
class PNB implements Bank{  
      public float rateOfInterest(){
    	  return 9.7f;
      }  
}  
public class Interface2{  
     public static void main(String[] args){  
         Bank bank=new SBI();  
         System.out.println("Rate Of Interest: "+bank.rateOfInterest()); 
         bank=new PNB();
         System.out.println("Rate Of Interest: "+bank.rateOfInterest());
     }
}  