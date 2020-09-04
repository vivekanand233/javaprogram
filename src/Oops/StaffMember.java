package Oops;

public class StaffMember  {

	
	
	String membername,memberqualification;
	
	StaffMember(String membername,String memberqualification)
	{
		
		this.membername=membername;
		this.memberqualification=memberqualification;
	}
	
	void display()
	{
		System.out.println("memeber name is:"+membername);
		System.out.println("qualification is:"+memberqualification);
	}
	
	
	
	
	public static void main(String [] args) {
		
		
		Department d=new Department("software","vivek");
		d.display();
		
		StaffMember s=new StaffMember("anu","B.Tech");
		s.display();
		
		
	}
	
	
	
	
	
	
	
	
	
	
}


