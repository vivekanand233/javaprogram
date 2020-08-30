package LoopPrograms;

import java.util.Scanner;

public class Tableofnumber {

	public static void main(String[] args) {
		
		int number,i;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter any number");
		number=sc.nextInt();
		
		for(i=1;i<=10;i++)
		{
			System.out.println(number+"*"+i+ "=" +i*number);
		}
		
		
		
		
		
		
		
	}

}
