package Ifelseprograms;

import java.util.Scanner;

public class NegativePositiveNumber {

	public static void main(String[] args) {
		
		int number;
		System.out.println("enter any number");
		Scanner sc=new Scanner(System.in);
		number =sc.nextInt();
		
		
		if(number >0)
		{
			System.out.println(number+"is positive number");
		}
		else if(number<0)
		{
		    System.out.println(number+ "is negative number");
		}
		else
			{
			System.out.println(number+"zero");
			}
	
		
		
		
		
		
	}

}
