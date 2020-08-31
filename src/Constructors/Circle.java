package Constructors;

public class Circle {

	
	float circleArea(float radius)
	{
		float area=(float)(3.14*radius*radius);
		System.out.println("area of circle is;"+area);
		return area;
	}
	 float circumference(float radius)
	 {
		 float circumference=(float)(2*3.14*radius);
		 System.out.println("area of circumference is"+circumference);
		 return circumference;
	 }
	
	
	
	public static void main(String[] args) {
		
		Circle cd=new Circle();
		cd.circumference(10);
		cd.circumference(20);
		
		
	}
	
	
	
	
	
}
