package variables;

import java.util.Scanner;

public class AccountManagement {

	Scanner sc=new Scanner(System.in);
	String name,bankname;
	
	int accountNo,amount;
	
	void insertData()
	{
		System.out.println("Enter name of customer");
		name=sc.next();
		System.out.println("Enter accountNo");
		accountNo=sc.nextInt();
		System.out.println("Enter bankname");
		bankname=sc.next();
		System.out.println("Enter amount");
		amount=sc.nextInt();

	}
	void depositAmount()
	{
		int depositAmount;
		System.out.println("Enter amount to deposit");
		depositAmount=sc.nextInt();
		amount = depositAmount+amount;
	}
	void WithdrawAmount()
	{
		int WithdrawAmount = 0;
		System.out.println("Enter amount to withdraw");
		amount=amount-WithdrawAmount;
	}
	void AmountBalance() 
	{
		System.out.println("balance is"+amount);
	}
	void displayData()
	{
		System.out.println("customer name"+name);
		System.out.println("customer accountno"+accountNo);
		System.out.println("account balance is"+amount);
		System.out.println("customer bankname"+bankname);
		
	}
}
