package Ifelseprograms;

import java.util.Scanner;

public class ProfitLoss {

	public static void main(String[] args) {
		float saleAmount, unitPrice, amount;
		   Scanner sc = new Scanner(System.in);
		
		System.out.print(" Please Enter the Actual Product Cost : ");
		unitPrice = sc.nextFloat();	
		
		System.out.print(" Please Enter the Selling Price (Market Price) : ");
		saleAmount = sc.nextFloat();
		
		if(saleAmount > unitPrice )
		{
			amount = saleAmount - unitPrice;
			System.out.println("\n Profit Amount =  " + amount);
		}
		else if(unitPrice > saleAmount)
		{
			amount = unitPrice - saleAmount;
			System.out.println("\n Loss Amount =  " + amount);
		}
		else
		{
			System.out.println("\n No Profit No Loss! ");
		}
		
		
		
		
		
		
		
		
		
		
	}

}
