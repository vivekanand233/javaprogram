package Ifelseprograms;

import java.util.Scanner;

public class UppercaseOrLowercase {

	public static void main(String[] args) {
		
		System.out.println("enter any character");
		Scanner sc= new Scanner(System.in);
		char ch= sc.next().charAt(0);
		
		if(ch>=65&&ch<=90)
		{
		System.out.println("character is uppercase");
		
		}
		else if(ch>=97&&ch<=122)
		{
			System.out.println("character is lowercase");
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
