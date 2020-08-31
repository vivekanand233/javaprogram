package Modifiers;

import java.util.Scanner;

public class EmployeeDemoMain {

	public static void main(String[] args) {
		int emp_salary,emp_id;
		String emp_name,emp_dept;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("employee department");
		 emp_dept=sc.next();
		 System.out.println("employee name");
		emp_name=sc.next();
		System.out.println("employee salary");
		emp_salary=sc.nextInt();
		System.out.println("employee id");
		emp_id=sc.nextInt();
		
		
		
		EmployeeDemo object=new EmployeeDemo();
		object.employeedept();
		object.Employeeid();
		object.Employeename();
		
		
		
		
		
		
		
		
	}

}
