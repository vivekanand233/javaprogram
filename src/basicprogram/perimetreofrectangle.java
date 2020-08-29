package basicprogram;

import java.util.Scanner;

public class perimetreofrectangle {

	public static void main(String[] args) {
		
		double length,width,perimeter;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter value of length");
		length=sc.nextDouble();
		
		System.out.println("Enter value of width");
		width=sc.nextDouble();
		
		perimeter=2*length*width;
		System.out.println("perimeter of rectangle is:"+perimeter);
		
		
	}

}
