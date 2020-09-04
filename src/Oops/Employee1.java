package Oops;

import java.util.Scanner;

public class Employee1 {

	
	long empid;
	String empname;
	String  empaddress;
	long empphone;
	double basicsal;
	double hra=100.50;
	double specialallowances=250.00;
	
	
	Employee1(long id,String name,String address,long phoneno)
	
	{     
		empid=id;
		empname=name;
	    empaddress=address;
		empphone=phoneno;
		
	}
	void transportallowance()
	{
		double transportallowance = 10/100*basicsal;
		System.out.println("transport allowance of employee is:"+transportallowance);
	}
	
	void calculationofsalary()
	{    Scanner s=new Scanner(System.in);
	
	System.out.println("Enter the basic salary : ");
	basicsal=s.nextDouble();
	
	    	
		double salary = basicsal + (basicsal *specialallowances/100) + (basicsal
				*hra/100);
		
		System.out.println("the total salary is:"+salary);
	}
	
	void showdetailsofemployee()
	{
		System.out.println("The Name of Employee is : "+empname);

		System.out.println("The Address of Employee is : "+empaddress);

		System.out.println("The Phone Number of Employee is : "+empphone);

		System.out.println("The Basic Salary of Employee is : "+basicsal);
	}
	
	
}
