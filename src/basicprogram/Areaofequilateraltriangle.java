package basicprogram;

import java.util.Scanner;

public class Areaofequilateraltriangle {

	public static void main(String[] args) {
		
		double a,area;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value of a");
		a=sc.nextDouble();
		
		area=(1.73*a*a)/4;
		System.out.println("area of equilateral triangle is:"+area);
		
		
	}

}
