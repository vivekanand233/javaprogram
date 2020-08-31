package Modifiers;

public class EmployeeDemo {

	
	protected int emp_id;
	
	public String emp_name;
	private int emp_salary;
	        String emp_dept;
	        
	        
	        
	    public void Employeename() 
	    {
	    	System.out.println("employee name");
	    }
	protected void Employeeid()
	{
		System.out.println("employee id");
	}
	private void Employeesalary()
	{
		System.out.println("employee salary");
	}
    void employeedept(String quality)
    {
    	
    	System.out.println("employee department");
    }

      void display() 
         {
    	  
    	  System.out.println("employee name" +emp_name);
    	  System.out.println("employee salary"+emp_salary);
    	  System.out.println("employee id"+emp_id);
    	  System.out.println("employee department"+emp_dept);
    	  
    	  
    	  
    	  
    	  
    	  }
}
