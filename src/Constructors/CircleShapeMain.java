package Constructors;

import java.util.Scanner;

public class CircleShapeMain {

	public static void main(String[] args) {
		float radius;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter value of radius");
		radius=sc.nextFloat();
		
		CircleShape obj=new CircleShape(radius);
		obj.circleShape(radius);
		
		
		CircleShape obj1=new CircleShape(radius, 3.5f);
		obj1.circleShape(radius);
		
	}

}
