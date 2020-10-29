class Employee{
    int empid;
    String empName;
    int salary;
    
    Employee(){
        empid=145;
	empName="Amit kumar";
	salary=12000;
    }

    void display(){
	System.out.println("Employee id="+empid);
	System.out.println("Employee name="+empName);
	System.out.println("Employee salary="+salary);
    }
}

public class EmployeeConstructor{
     public static void main(String[] args){
	Employee amit=new Employee();
	amit.display();
     }
}
	       