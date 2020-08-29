package basicprogram;

import java.util.Scanner;

public class Perimeterofcircle {

	public static void main(String[] args) {
		
		double pi,r,perimeter; //r=radius
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value of pi");
		pi=sc.nextDouble();
		
		System.out.println("Enter value of r");
		r=sc.nextDouble();
		
		perimeter=2*pi*r;
		System.out.println("perimeter of circle is:"+perimeter);
		
		
	}

}
