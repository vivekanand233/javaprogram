package MultiThreading;

public class Thread12 extends Thread {

	public void run()
	{
		for(int i=0;i<=10;i++)
		{
			System.out.println(Thread.currentThread().getName()+"succesfully exexuted.");
			
		}
	}
}
