package MultiThreading;

public class SleepMethod extends Thread {

	
	public void run()
	{
		try
		{
		for(int i=0;i<=4;i++)
			{
			System.out.println(Thread.currentThread().getName()+"vivek");
			
			Thread.sleep(5000);
			} 
		}
		catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
		
	}
	
	
	
	
	
	
	
	
}
