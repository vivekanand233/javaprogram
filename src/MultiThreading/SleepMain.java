package MultiThreading;

public class SleepMain {

	public static void main(String[] args) {
		
		
		SleepMethod t1 = new SleepMethod();
		
		t1.setName("thread1:");
		
		t1.start();
		
		for(int i=0;i<4;i++)
		{
			System.out.println("main method:");
		}
		
		
		
	}

}
