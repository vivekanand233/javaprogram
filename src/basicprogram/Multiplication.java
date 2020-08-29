package basicprogram;

import java.util.Scanner;

public class Multiplication {

	public static void main(String[] args) {
		
		int number1,number2,multiplication;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number1");
		number1=sc.nextInt();
		
		System.out.println("Enter number2");
		number2=sc.nextInt();
		
		multiplication= number1*number2;
		
		System.out.println("multiplication of number1 & number2 is="+multiplication);
		
		
	}

}
