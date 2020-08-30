package LoopPrograms;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		int number=sc.nextInt();
		
		int firstNumber,secondNumber,thirdNumber;
		firstNumber=0;
		secondNumber=1;
		System.out.print(firstNumber+" "+secondNumber);
		
		for(int i=0;i<number-2;i++)
		{
			thirdNumber=firstNumber+secondNumber;
			firstNumber=secondNumber;
			secondNumber=thirdNumber;
			System.out.print(" "+thirdNumber);
		}
}

}
