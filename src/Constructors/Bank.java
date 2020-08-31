package Constructors;

public class Bank {

	int amount=5000;
	
	Bank()
	{
		
		System.out.println("no amount added to bank");
	}
		Bank(int amount)
		{
			this.amount=this.amount+amount;
			
		}
		void display()
		{
			
			System.out.println("amount in your account is" +amount);
		}
		
		
       		

         public static void main(String[] args) {
        	 
        	 
        	 Bank Addamount=new Bank();
        	 new display();
        	 
        	 
        	 
        	 
        	 
        	 
        	 
        	 
        	 
        	 
        	 
         }
















}
