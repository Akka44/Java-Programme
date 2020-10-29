class Student{
    int studentId;
    String studentName;
    int studentRollNo;
    String studentAddress;
    String studentBranch;
    
    Student(int studentId, String studentName, int studentRollNo, String studentAddress, String studentBranch){
         this.studentId=studentId;
	 this.studentName=studentName;
	 this.studentRollNo=studentRollNo;
         this.studentAddress=studentAddress;
	 this.studentBranch=studentBranch;
    }

    void display(){
	System.out.println("student id="+studentId);
	System.out.println("studnet name="+studentName);
	System.out.println("student roll no.="+studentRollNo);
	System.out.println("student address="+studentAddress);
	System.out.println("student branch="+studentBranch);
    }
}

public class StudentConstructor{
     public static void main(String[] args){
	Student aman=new Student(123,"Aman",23,"Noida","MCA");
	aman.display();
     }
}
	       