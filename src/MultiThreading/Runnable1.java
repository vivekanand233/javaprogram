package MultiThreading;

public class Runnable1 implements Runnable  {

	
	public void run()
	{
		for(int i=0;i<=5;i++)
		{
			System.out.println(Thread.currentThread().getName()+" VIVEK ");
		}
		
	
	}
	
	
}
