package Ifelseprograms;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		
		int year;
		System.out.println("enter any year");
		Scanner sc=new Scanner(System.in);
		year =sc.nextInt();
		boolean leap=true;
		
		if(year%4==0)
		
		{
		System.out.println("year is leap");	
		
		}
		else if(year%4!=0) 
		{
			System.out.println("year is not leap");
		}
		
	}

}
