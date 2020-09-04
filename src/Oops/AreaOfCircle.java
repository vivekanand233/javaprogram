package Oops;

public class AreaOfCircle {

	 final double pi;
	double r,area;
	 
	 
	
	AreaOfCircle(double pi,double r)
	{
		this.pi=pi;
		this.r=r;
	}
	void Area()
	{
		double area=pi*r*r;
		System.out.println(area);
		
    }
	
	public static void main(String[] args) {
		
		AreaOfCircle a=new AreaOfCircle(3.14,3);
		a.Area();
		
	}
	
	
	
}
