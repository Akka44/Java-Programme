class Faster {
            String bowlerName;
            String bowlerSpeed;	
	    String bowlerHeight;
	    String bowlingHand;
	    int jersyNo;
	 
}
class Spinner
{
           String bowlerName;
           String bowlerSpeed;	
           String bowlerHeight;
           String bowlingHand;
           int jersyNo;
}
public class Bowler
{
	public static void main(String[] args)
	{
          Faster b1=new Faster();
          b1.bowlerName="jasprit bumrah";
          b1.bowlerSpeed="134 km/hr";	
          b1.bowlerHeight="160 cm";
          b1.bowlingHand="right";
          b1.jersyNo=22;

	  System.out.println("============ fast Bowler details =============");
	  System.out.println("Bowler name is : " +b1.bowlerName);
	  System.out.println("Bowling speed is : " +b1.bowlerSpeed);
          System.out.println("bowler Height is : " +b1.bowlerHeight);
          System.out.println("bowling hand is : " +b1.bowlingHand);
	  System.out.println("bowler jersy number is : " +b1.jersyNo);
		
	  Spinner b2=new Spinner();
          b2.bowlerName="R. Ashwin";
          b2.bowlerSpeed="50 km/hr";	
          b2.bowlerHeight="162 cm";
          b2.bowlingHand="right";
          b2.jersyNo=53;

	  System.out.println("============ spin Bowler details =============");
	  System.out.println("Bowler name is : " +b1.bowlerName);
	  System.out.println("Bowling speed is : " +b1.bowlerSpeed);
          System.out.println("bowler Height is : " +b1.bowlerHeight);
          System.out.println("bowling hand is : " +b1.bowlingHand);
	  System.out.println("bowler jersy number is : " +b1.jersyNo);
		
		
	}
}

