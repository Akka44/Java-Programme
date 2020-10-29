import java.util.Scanner;

class Spinner
{
           String bowlerName;
           String bowlerSpeed;	
           String bowlerHeight;
           String bowlingHand;
           int jersyNo;
}

public class BowlerScanner
{
	public static void main(String[] args)
	{
		  Scanner sc=new Scanner(System.in);
		  System.out.println("Enter Bowler Details");
          Faster spinner=new Faster();
          spinner.bowlerName=sc.nextLine();
          spinner.bowlerSpeed=sc.nextLine();	
          spinner.bowlerHeight=sc.nextLine();
          spinner.bowlingHand=sc.nextLine();
          spinner.jersyNo=sc.nextInt();

	      System.out.println("============ Spinner Bowler details =============");
	      System.out.println("Bowler name is : " +spinner.bowlerName);
	      System.out.println("Bowling speed is : " +spinner.bowlerSpeed);
          System.out.println("bowler Height is : " +spinner.bowlerHeight);
          System.out.println("bowling hand is : " +spinner.bowlingHand);
	      System.out.println("bowler jersy number is : " +spinner.jersyNo);
		
		
	}
}

