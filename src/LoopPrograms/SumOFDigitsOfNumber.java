package LoopPrograms;

import java.util.Scanner;

public class SumOFDigitsOfNumber {

	public static void main(String[] args) {
		
		int number=0,rem=0,sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		number=sc.nextInt();
		
		while(number>0)
		{
			rem=number%10;
			sum=sum+rem;
			number=number%10;
		}
		System.out.println("sum of digits is" +sum);
		
		
		
		
	}

}
