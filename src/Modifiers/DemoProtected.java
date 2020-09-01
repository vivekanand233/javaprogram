package Modifiers;

public class DemoProtected {

	protected int number; //instance variable
	
	protected DemoProtected() // zero args constructor
	{
		number=77;
	}
	
	protected void display() // method
	{
		System.out.println(number);
	}
	

}
