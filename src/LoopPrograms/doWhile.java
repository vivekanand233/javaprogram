package LoopPrograms;

import java.util.Scanner;

public class doWhile {

	public static void main(String[] args) {
		int number;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter any number");
		number=sc.nextInt();
		
		do 
		{
			System.out.println(number);
			number++;
		}
		while(number<=10);
		
		
	}

}
