package Ifelseprograms;

import java.util.Scanner;

public class AlphaDigitSpecialchar {

	public static void main(String[] args) {
		
		System.out.println("enter any character");
		
		Scanner sc=new Scanner(System.in);
		char ch=sc.next().charAt(0);
		
		if(ch<=65&&ch>=90||ch<97&&ch>=122)
		{
			System.out.println("it is an alphabet");
			
		}
		else if(ch<=48&&ch>=57)
		{
			System.out.println("it is a digit");
			
		}
		else
		{
			System.out.println(" it is special character");
		}

	}

}
