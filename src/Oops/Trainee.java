package Oops;

public class Trainee extends Manager1{


	Trainee(long id,String name,String address,long phone,double salary)
	{
		super(id,name,address,phone,salary);
		empid=id;
		empname=name;
		empaddress=address;
		empphone=phone;
		basicsal=salary;
		
	}
	
	void transportallowance()
	{
		double transportallowance = 10/100*basicsal;
		System.out.println("transport allowance of trainee is:"+transportallowance);
		
		
	}
	
	void showdetailsofTrainee()
	{
		System.out.println("TRainee id is:"+empid);
		System.out.println("name of Trainee is:"+empname);
		System.out.println("address of Trainee is:"+empaddress);
		System.out.println("phone number of Trainee is:"+empphone);
		System.out.println("salary of Trainee is:"+basicsal);

		
	}
	
	
	
}
