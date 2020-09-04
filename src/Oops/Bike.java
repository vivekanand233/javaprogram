package Oops;

public class Bike extends Vehicle 
{

	int discountrate;
	
	Bike(String vehiclename,int vehiclemodelno,int vehicleprice,String servicestationname)
	{
		super(vehiclename,vehiclemodelno,vehicleprice,servicestationname);
		this.vehiclename=vehiclename;
		this.vehiclemodelno=vehiclemodelno;
		this.vehicleprice=vehicleprice;
		this.servicestationname=servicestationname;
	}
	
	void display()
	{System.out.println("bike name is:"+vehiclename);
	System.out.println("bike model no is:"+vehiclemodelno);
	System.out.println("bike price is:"+vehicleprice);
	System.out.println("bike service station name is:"+servicestationname);

		
	}
	
	void discount() 
	{
	int discountamount;
	discountamount=(vehicleprice-((discountrate/100)*vehicleprice));
	
	System.out.println("discount is:"+discountamount);
	
	}
	
	
	public static void main(String[] args) {
	
	
		
		Vehicle v=new Vehicle("skoda",3425,455567,"pune");
		v.display();
		
		
		Bike b=new Bike("KTM",3434,55446,"nanded");
		b.display();
	}
	
	
	
	
	
	
	
	
}
