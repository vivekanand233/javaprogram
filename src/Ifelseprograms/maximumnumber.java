package Ifelseprograms;

import java.util.Scanner;

public class maximumnumber {

	public static void main(String[] args) {
		
		int number1,number2,number3;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter number1");
		number1=sc.nextInt();
		
		System.out.println("enter number2");
		number2=sc.nextInt();
		
		System.out.println("enter number3");
		number3=sc.nextInt();
	
	if(number1>=number2 && number1>=number3)
	{
	   System.out.println("number1 is greater");	
	}
	else if(number2>=number3)
	{
		System.out.println("number2 is greater number");
	}
	else 
	{
	 System.out.println("number3 is greater number");	
	}
	
	
	}
	
	
	
	
	

}
