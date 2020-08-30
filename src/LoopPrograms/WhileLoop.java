package LoopPrograms;

import java.util.Scanner;

public class WhileLoop {

	public static void main(String[] args) {
		
		
		int number;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter any number");
		number=sc.nextInt();
		
		while(number<=10)
		{
			System.out.println(number);
			number++;
		}
		
	}

}
