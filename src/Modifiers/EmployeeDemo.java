package Modifiers;

import java.util.Scanner;

public class EmployeeDemo {

	
	protected int empid;
	public String empname;
	private int empsalary;
	        String empdept;
	        
	        
	        
	    void userinput()    
	    {
	    	Scanner sc=new Scanner(System.in);
	    	System.out.println("name of employee:");
	    	empname=sc.next();
	    	System.out.println("id of employee:");
	    	empid=sc.nextInt();
	    	System.out.println("salary of employee:");
	    	empsalary=sc.nextInt();
	    	System.out.println("department of employee:");
	    	empdept=sc.next();
	    	
	    }
	        
	        
	        
	    public void dopublic() 
	    {
	    	System.out.println("method is public");
	    }
	protected void doprotected()
	{
		System.out.println("method is protected");
	}
	private void doprivate()
	{
		System.out.println("method is private");
	}
    void dodefault()
    {
    	
    	System.out.println("method is default");
    }

      void display() 
         {
    	  
    	  System.out.println("employee name:" +empname);
    	  System.out.println("employee salary:" +empsalary);
    	  System.out.println("employee id:" +empid);
    	  System.out.println("employee department:" +empdept);
         }  	  
    	  public static void main(String[] args) {
    			
    			
    			
    			EmployeeDemo object=new EmployeeDemo();
    			object.userinput();
    			object.dodefault();
    			object.doprotected();
    			object.dopublic();
    			
    			object.display();
    			
    		  
    	  
    	  
    	  
    	  }
}
