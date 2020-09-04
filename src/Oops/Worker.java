package Oops;

import java.util.Scanner;

public class Worker {

	String name;
	int age;
	int phonenumber;
	String address;
	int salary;
	
	
	void userinput()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("name of worker");
		name=sc.next();
		System.out.println("age of worker");
		age=sc.nextInt();
		System.out.println("phone number of worker");
		phonenumber=sc.nextInt();
		System.out.println("address of worker");
		address=sc.next();
		System.out.println("salary of worker");
		salary=sc.nextInt();
	}
	void display()
	{
		System.out.println("salry of worker:" +salary);
	}
	
	
	
	
	
	
}
