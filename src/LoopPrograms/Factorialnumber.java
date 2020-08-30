package LoopPrograms;

import java.util.Scanner;

public class Factorialnumber {

	public static void main(String[] args) {
		
		int number,fact=1;
		Scanner sc=new Scanner(System.in);
		System.out.println( "enter number");
		number=sc.nextInt();
		
		
		for(int i=1;i<=number;i++)
		{
			fact=fact*i;
		}
		
		System.out.println("factorial of" + number + "is" + fact);
		
		
	}

}
