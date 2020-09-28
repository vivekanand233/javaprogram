package MultiThreading;

public class RunnableMain {

	public static void main(String[] args) {
		
		Runnable1 runObject=new Runnable1();
		
		Thread thread1=new Thread(runObject);
		thread1.setName("1st thread");
		Thread thread2=new Thread(runObject);
		thread2.setName("2nd thread");
		Thread thread3=new Thread(runObject);
		thread3.setName("3rd thread");
		thread1.start();
		thread2.start();
		thread3.start();
		
		
		for(int i=0;i<=2;i++)
		{
			System.out.println("this is main method.");
		}

		
		
		
		
		
		
		
		
		
	}

}
