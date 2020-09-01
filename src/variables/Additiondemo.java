package variables;

public class Additiondemo {

	int number1;
	static int number2;
	public void addition() 
	{
		int result=number1+number2;
		System.out.println("addition of number1 & number2 is:"+result);
	}
	
	public void substraction()
	{
		
		int result=number1-number2;
		System.out.println("substraction of number1 &number2 is:"+result);
	}
	public void multiplication()
	{
		int result =number1*number2;
		System.out.println("multiplication of number1 & number2 is:"+result);
		
	}
	public void division()
	{
		int result =number1/number2;
		System.out.println("division of number1 & number2 is"+result);
	}
	
	
}
