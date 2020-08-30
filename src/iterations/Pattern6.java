package iterations;

public class Pattern6 {

	public static void main(String[] args) {
		
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++) 
			{
				int rem=j%2;
				System.out.print(+ rem);
			}
				System.out.println();
			
		}
		
		
	}

}
