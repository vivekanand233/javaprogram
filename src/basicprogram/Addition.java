package basicprogram;

import java.util.Scanner;

public class Addition {

	public static void main(String[] args) {
		int a,b;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter value of a");
		a=sc.nextInt();
		
		System.out.println("Enter value of b");
		b=sc.nextInt();
		
		 int result=a+b;
		 System.out.println("addition of number1 & number2 is:"+result);
		
		
	}

}
