package Ifelseprograms;

import java.util.Scanner;

public class GradeOfSubject {

	public static void main(String[] args) {
		int subject1,subject2,subject3;
		Scanner s= new Scanner(System.in);
		
		System.out.println("enter marks of subject1");
		subject1=s.nextInt();
		
		System.out.println("enter marks of subject2");
		subject2=s.nextInt();
		
		System.out.println("enter marks of subject3");
		subject3=s.nextInt();
		
		int totalmarks=subject1+subject2+subject3;
		System.out.println("result="+totalmarks);
		
		int percentage=(totalmarks*100)/300;
		System.out.println("percentage="+percentage);
		
		if(percentage>=90)
		{
			System.out.println("grade :A");
			
		}
		else if(percentage>=70)
		{
			System.out.println("Grade: B");
			
		}
		else if(percentage>=50)
		{
			System.out.println("Grade: c");
		}
    }

}
