package basicprogram;

import java.util.Scanner;

public class Araeofcircle {

	public static void main(String[] args) {
		
		double pi,r,area; //r=radius
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value of pi");
		pi=sc.nextDouble();
		
		System.out.println("Enter value of r");
		r=sc.nextDouble();
		
		area=pi*r*r;
		
		System.out.println("area of circle is:"+area);
		
		
	}

}
