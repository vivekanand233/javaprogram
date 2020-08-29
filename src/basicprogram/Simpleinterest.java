package basicprogram;

import java.util.Scanner;

public class Simpleinterest {

	public static void main(String[] args) {
		
	double si,p,r,n;//si=simple interest,p=principal balance,r=rate of interest,n=time(in years)
		
	Scanner sc=new Scanner(System.in);
		System.out.println("Enter value of principal");
		p=sc.nextDouble();
		
		System.out.println("enter value of r");
		r=sc.nextDouble();
		
		System.out.println("Enter value of n");
		n=sc.nextDouble();
		
		si=(p*r*n)/100;
		
		System.out.println("simple interest is:"+si);
	}

}
