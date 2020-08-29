package basicprogram;

import java.util.Scanner;

public class Areaofrectangle {

	public static void main(String[] args) {
		
		double length,width,area;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value of length");
		length=sc.nextDouble();
		
		System.out.println("Enter value of width");
		width=sc.nextDouble();
		
		area=length*width;
		System.out.println("area of rectangle is:"+area);
		
		
		
	}

}
