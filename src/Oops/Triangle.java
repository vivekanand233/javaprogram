package Oops;

public class Triangle extends Rectangle {

	int side1,side2,side3;
	
	Triangle(int length,int side,int side3)
	{
		
		super(length,side);
		this.side1=length;
		this.side2=side;
		this.side3=side3;
		
		
	}
	void area()
	{
		int area=side*side2*side3;
		System.out.println("area of triangle is:"+area);
	}
	
	public static void main(String[] args) {
		
		
		
		Square sq=new Square(12);
		sq.area();
		
		Rectangle rect=new Rectangle(10,3);
		rect.area();
		
		Triangle tr=new Triangle(23,43,4);
		tr.area();
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
}
















	