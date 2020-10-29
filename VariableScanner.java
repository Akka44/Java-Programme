import java.util.Scanner;

class Employee
{
	String employee_name;
        int employee_id;
        int employee_salary;
        String employee_department;
        static String company_name;
	String employee_address;	
}
public class VariableScanner
{
	public static void main(String[] args)
	{
	  Employee amit=new Employee();
          Scanner sc=new Scanner(System.in);
		
	  System.out.println("Enter Employee Details");
		
	  amit.employee_name=sc.nextLine();
          amit.employee_id=sc.nextInt();
          amit.employee_salary=sc.nextInt();
          amit.employee_department=sc.nextLine();
          Employee.company_name=sc.nextLine();
	  amit.employee_address=sc.nextLine();
		
          System.out.println("===========employee details=================");
          System.out.println("employee name is:" +amit.employee_name);
	  System.out.println("employee id is:" +amit.employee_id);
	  System.out.println("employee salary is:" +amit.employee_salary);
	  System.out.println("employee department  is: " +amit.employee_department);
	  System.out.println("company name is: " +Employee.company_name);
          System.out.println("employee address is: " +amit.employee_address);
		
		
	}
}

