package Oops;


public class Department {

	
	String departmentname;
	String HODname;
	
	Department(String departmentname,String HODname)
	{
		this.departmentname=departmentname;
		this.HODname=HODname;
		
	}
	
	void showdepartmentdetails()
	{
		System.out.println("departmentname:" +departmentname);
		System.out.println("HOD name is:" +HODname);
	}
	
	
	
	
}
