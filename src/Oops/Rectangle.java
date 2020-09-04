package Oops;

public class Rectangle extends Square 
{

	
	
	int length,breadth;
	
     Rectangle(int length,int side)
	 {
		super(side);
		this.length=length;
		this.breadth=side;
		//this.breadth=breadth
	}
	
	void area()//overriding of square class area method
	{
		long arearect=length*side;
		System.out.println("area of rectangle is:"+arearect);
		
	}
	
	
	
	
	
	
	
	
	
	
	
}
