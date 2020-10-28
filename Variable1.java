class Student {
          String student_name;
	  int student_id;
          float percentage;	
	  String student_address;
	  String student_course;
	  static String college_name;
	 
}
class Employee
{
	 String employee_name;
         int employee_id;
         int employee_salary;
         String employee_department;
         static String company_name;
	 String employee_address;	
}
public class Variable1
{
	public static void main(String[] args)
	{
         Student akshay=new Student();
         akshay.student_name="Akshay Sharma";
         akshay.student_id=18372645;
         akshay.percentage=74.6f;
         akshay.student_address="Noida";
         akshay.student_course="B.Tech";
         Student.college_name="BIT";

	 System.out.println("============Student details =============");
	 System.out.println("student name is : " +akshay.student_name);
	 System.out.println("student id is : " +akshay.student_id);
         System.out.println("student phone number is : " +akshay.student_phoneNumber);
         System.out.println("student percentage is : " +akshay.percentage);
	 System.out.println("student address is : " +akshay.student_address);
         System.out.println("student id is : " +akshay.student_course);
	 System.out.println("college name is : " +Student.college_name);
		
		
	 Employee amit=new Employee();		
	 amit.employee_name="Amit kumar";
         amit.employee_id=7836356;
         amit.employee_salary=29355;
         amit.employee_department="accountant";
         Employee.company_name="CTS";
	 amit.employee_address="delhi";	
         System.out.println("===========employee details=================");
         System.out.println("employee name is:" +amit.employee_name);
	 System.out.println("employee id is:" +amit.employee_id);
	 System.out.println("employee phone number is:" +amit.employee_phoneNumber);
	 System.out.println("employee salary is:" +amit.employee_salary);
	 System.out.println("employee department  is: " +amit.employee_department);
	 System.out.println("company name is: " +Employee.company_name);
         System.out.println("employee address is: " +amit.employee_address);
		
		
	}
}

