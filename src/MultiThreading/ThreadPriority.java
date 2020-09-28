package MultiThreading;

public class ThreadPriority {

	public static void main(String[] args) {
		
		
		
		MyThreadPriority t1 = new MyThreadPriority();
		
		t1.setName("thread1");
		System.out.println("Thread1 priority is:"+t1.getPriority());
		t1.start();
		
		MyThreadPriority t2 = new MyThreadPriority();
		
		t2.setName("thread2");
		t2.setPriority(7);
		System.out.println("Thread1 priority is:"+t2.getPriority());
		t2.start();
		for(int i=0;i<3;i++)
		{
			System.out.println("this is main method:");
		}
	}

}
