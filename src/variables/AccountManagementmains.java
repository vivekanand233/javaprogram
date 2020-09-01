package variables;

import java.util.Scanner;

public class AccountManagementmains {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Additiondemo a=new Additiondemo();
		System.out.println("Enter two numbers");
		a.number1=sc.nextInt(); // access instance variable bya class name
		Additiondemo.number2=sc.nextInt();
		a.addition();
		a.substraction();
		a.multiplication();
		a.division();
		
		
		
	}

}
