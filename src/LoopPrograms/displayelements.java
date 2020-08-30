package LoopPrograms;

import java.util.Scanner;

public class displayelements {

	public static void main(String[] args) {
		
		int num1,num2,res,i;

		Scanner sc=new Scanner(System.in);

		System.out.println("enter the first number of range:");
		num1=sc.nextInt();

		System.out.println("enter the second number of range:");
		num2=sc.nextInt();

		for(i=num1;i<=num2;i++)
		{
			res=i%10;

			if(res==7)
			{

			System.out.println(i);

			}


		
		
		
		
		}	
	}
		
}


