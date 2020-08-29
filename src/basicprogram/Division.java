package basicprogram;

import java.util.Scanner;

public class Division {

	public static void main(String[] args) {
		
		int number1,number2,division;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter number1");
		number1=sc.nextInt();
		
		System.out.println("Enter number2");
		number2=sc.nextInt();
		
		division=number1/number2;
		System.out.println("division of number1 & number2 is:"+division);
		
		
		
		
		
	}

}
