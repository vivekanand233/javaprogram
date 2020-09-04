package Oops;



    public class Vehicle {

	String vehiclename;
	int vehiclemodelno;
	int vehicleprice;
	String servicestationname;

	
	
		
	
	 Vehicle (String vehiclename,int vehiclemodelno,int vehicleprice,String servicestationname)
	{
		 this.vehiclename=vehiclename;
		this.vehiclemodelno=vehiclemodelno;
		this.vehicleprice=vehicleprice;
		this.servicestationname=servicestationname;
		
		
	}
	void display()
	{
		System.out.println("vehicle name is:"+vehiclename);
		System.out.println("vehicle model number is:"+vehiclemodelno);
		System.out.println("vehicle price is:"+vehicleprice);
		System.out.println("service station name is:"+servicestationname);
		
	}
	
	
	
	
	
	
	
	
}
