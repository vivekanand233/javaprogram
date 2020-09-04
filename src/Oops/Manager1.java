package Oops;

public class Manager1 extends Employee1{

	Manager1(long id,String name,String address,long phone,double salary )
	{
		super(id,name,address,phone);
		
		empid=id;
		empname=name;
		empaddress=address;
		empphone=phone;
		basicsal=salary;
	}
	
	void transportallowance()
	{
		double transportallowance=15*basicsal/100;
		System.out.println("transport allowance of manager is:"+transportallowance);
	}
	void showdetailsofmanager1()
	{
		System.out.println("manager id is:"+empid);
		System.out.println("name of manager is:"+empname);
		System.out.println("address of manager is:"+empaddress);
		System.out.println("phone number of manager is:"+empphone);
		System.out.println("salary of manager is:"+basicsal);
	}
	
	
}
