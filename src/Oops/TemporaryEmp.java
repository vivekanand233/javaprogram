package Oops;

public class TemporaryEmp extends Employeee {

	double hike = 0.35;
	void incrementSalary()
	{
	System.out.println("The Temporary Employee incremented salary is :" +(salary+(salary * hike)));
	}
	
	
	
}
