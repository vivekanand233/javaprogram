package MultiThreading;

public class MyThread8Main {

	public static void main(String[] args) {
		
		MyThread8 thread1 = new MyThread8();
		MyThread8 thread2 = new MyThread8();
		thread1.setName("thraed 1");
		thread1.start();
		
		thread2.setName("thraed 2");
		thread2.start();
		
		for(int i=0;i<=5;i++)
		{
		
			System.out.println("main thread");
		}
		
		
		
		
		
		
		
		
		
		
	}

}
