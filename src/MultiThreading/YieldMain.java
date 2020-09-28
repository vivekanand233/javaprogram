package MultiThreading;

public class YieldMain {

	public static void main(String[] args) {
		
		Yield thread1 =new Yield();
		thread1.setName("1st thraed");
		thread1.start();
		
		for(int i=0;i<=10;i++)
		{
			System.out.println("main thrad executing.");
		}
		
		
		
		
		
		
		
		
	}

}
