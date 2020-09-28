package MultiThreading;

public class MyThread8 extends Thread implements Runnable{

	
	public void run()
	{
		for(int i=0;i<3;i++)
		{
			System.out.println(Thread.currentThread().getName()+"child thread");
		}
	}
	
	
	
	
	
	
	
	
}
