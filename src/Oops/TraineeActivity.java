package Oops;

import java.util.Scanner;

public class TraineeActivity {

	public static void main(String[] args) {
		
          Long id;
		
		String name,  address;
		long phone;
		 Double salary = 0.0;
		
		Scanner sc=new Scanner(System.in);

		
		System.out.println("Enter The Id :");
		id=sc.nextLong();
		
		System.out.println("Enter The Name :");
		name=sc.next();
		
		System.out.println("Enter The Address :");
		address=sc.next();
		
		System.out.println("Enter The Phone Number :");
		phone=sc.nextLong();
		
	
	Manager1 m=new Manager1(id,name,address,phone,salary);
		
		Trainee t=new Trainee(id,name,address,phone,salary);
		t.calculationofsalary();
		t.transportallowance();
		t.showdetailsofemployee();
		t.showdetailsofmanager1();
		t.showdetailsofTrainee();
		
		
		
		
		
		
		
	}

}
