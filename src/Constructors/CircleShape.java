package Constructors;

public class CircleShape {

	float radius,pi=3.5f;
	
	CircleShape(float radius)
	{
		this.radius=radius;
	}
	CircleShape(float radius,float pi)
	{
		this.radius=radius;
		this.pi=pi;
	}
	void circleShape(float radius)
	{
		float shape=radius*radius*pi;
		System.out.println("the shape of circle is:"+shape);
	}
	
	
	
	
	
}
