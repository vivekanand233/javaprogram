package encapsulationPrograms;

public class Employee {

	private int id;
	private String name;
	
	
	
	public int getId() 
	{
		return id;
	}
	
	public void setId(int id)
	{
		this.id = id;
	}
	
	public String getName()
	{
		return name;
	}
	public void setName(String name) 
	{
		this.name = name;
	}
	
	public static void main(String[] args) {
		
	Employee e=new Employee();
	e.setId(23);
	e.setName("vivek");
	
	System.out.println("Employee id is:"+e.getId());
		System.out.println("Employee name is:"+e.getName());
		
		
	}
	
	
	
	
	
	
	
	
}
