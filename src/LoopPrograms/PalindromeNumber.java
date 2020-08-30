package LoopPrograms;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		int number=sc.nextInt();
		int z,rev=0;
		z=number;
		
		while(number>0)
		{
			rev=(rev*10)+number%10;
			number=number/10;
		}
		if(rev==z)
		{
			System.out.println("is palindrome number");
		}
		else 
		{
			System.out.println( "not palindrome number");
		}
    
	}

}
