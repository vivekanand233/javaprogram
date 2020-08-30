package LoopPrograms;

import java.util.Scanner;

public class primenumber {

	public static void main(String[] args) {
		
		int number;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		number=sc.nextInt();
		int count=0;
		
		for( int i=1;i<=number;i++)
		{
			if(number%i==0) 
			count++;
			
			
				
			
		}
		if(count==2)
		{
			System.out.println(number+" prime number");
		}
		else
		{
			System.out.println(number+"number is not prime");
		}
			
			
	}

}
