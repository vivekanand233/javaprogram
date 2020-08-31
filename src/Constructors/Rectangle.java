package Constructors;

import java.util.Scanner;

public class Rectangle {

	int length, breadth,area;
	
	
	
	Rectangle()
	{
		length=0;
		breadth=0;
	}
	Rectangle(int length,int breadth)
	{
		this.length=length;
		this.breadth=breadth;
	}
	Rectangle(int number)
	{
		length=number;
		breadth=number;
	}
	
	void area()
	{
		area=length*breadth;
		System.out.println("the area of rectanle is:"+area);
	}
	void display()
	{
		
		System.out.println("the area of rectange is: " +area);
	}
		
}