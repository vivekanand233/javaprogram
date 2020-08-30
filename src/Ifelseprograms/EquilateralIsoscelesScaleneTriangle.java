package Ifelseprograms;

import java.util.Scanner;

public class EquilateralIsoscelesScaleneTriangle {

	public static void main(String[] args) {
		
		int a,b,c; //a=side1,b=side2,c=side3
		System.out.println("enter three sides of traingle");
		Scanner side=new Scanner(System.in);
		
		System.out.println("enter value of a");
		a=side.nextInt();
		
		System.out.println("enter value of b");
		b=side.nextInt();
		
		System.out.println("enter value of c");
		c=side.nextInt();
		
		if(a==b && b==c)
		{
			System.out.println("equilateral triangle");
			
		}
		else if((a==b && b!=c)||(a!=b&&b==c)||(c==b&&c!=a))
		{
			System.out.println("isosceles triangle");
			
		}
		else 
		{
			System.out.println("scalene triangle");
		}
		
		
		
		
		
		
		
		
	}

}
