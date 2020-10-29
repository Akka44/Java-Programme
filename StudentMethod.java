class University {
		        void listOfColleges(){
				System.out.println("1.RKJIT  2.AKG  3.BIT  4.MIET");
			}
			void selectCollege(int college_code1, int college_code2){
				System.out.println("Selected colleges are "+"RKGIT"+","+" MIET");
			}
			int seatAlloted(){
				return 4;
			}
			int giveFee(){
                                return 5000; 
	                }
			String payFee(int fee){
				System.out.println("Amount given is "+fee);
				return "submitted";
			}	
}

public class StudentMethod
{
	public static void main(String[] args)
	{
			University aktu=new University();
			aktu.listOfColleges();
			aktu.selectCollege(1,4);
			System.out.println("seat alloted in college "+aktu.seatAlloted());
			System.out.println("fee is "+aktu.giveFee());
			System.out.println("fee : "+aktu.payFee(5000));
		
	}
}