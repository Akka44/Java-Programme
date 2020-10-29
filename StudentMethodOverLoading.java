class University {
		        void listOfColleges(){
				System.out.println("1.RKJIT  2.AKG  3.BIT  4.MIET");
			}
			void selectCollege(int college_code1, int college_code2){
				System.out.println("Selected colleges are "+"RKGIT"+","+" MIET");
			}
                        void selectCollege(int college_code1, int college_code2, int college_code3){
                                System.out.println("selected colleges are "+"RKGIT"+","+" BIT"+","+" MIET");
	                }
	                void selectCollege(int college_code){
                                System.out.println("selected college is "+"AKG");
	                }
	
			
}

public class StudentMethodOverloading
{
	public static void main(String[] args)
	{
			University aktu=new University();
			aktu.listOfColleges();
			aktu.selectCollege(3);
   			aktu.selectCollege(1,4);
			aktu.selectCollege(1,3,4);
			
			
		
	}
}