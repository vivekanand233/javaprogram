package LoopPrograms;

import java.util.Scanner;

public class CountNumberOfDigit {

	public static void main(String[] args) {
		
		int number;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		number=sc.nextInt();
		int count=0;   
		
		for ( ;number != 0; number/=10, ++count) {   
        }

        System.out.println("Number of digits: " + count);
		
		
		
	}

}
