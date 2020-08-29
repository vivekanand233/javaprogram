package basicprogram;

import java.util.Scanner;

public class Averageofsubjects {

	public static void main(String[] args) {
		
		int marathi,english,math;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter marks of marathi subject");
		marathi=sc.nextInt();
		
		System.out.println("Enter marks of english subject");
		english=sc.nextInt();
		
		System.out.println("Enter marks of math subject");
		math=sc.nextInt();
		
		int totalmarks=marathi+english+math;
		int average=totalmarks/3;
		
		
		System.out.println("totalmarks:"+totalmarks);
		System.out.println("average of marks is:"+average);
		
		
		
	}

}
