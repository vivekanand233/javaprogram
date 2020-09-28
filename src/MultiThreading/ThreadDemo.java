package MultiThreading;

public class ThreadDemo {

	public static void main(String[] args) {
		
		
		
		
		Mythread t1 = new Mythread();
		t1.start();
		
		for(int i=0;i<5;i++)
		{
			System.out.println("this is main Thread:");
		}
		
		
		
		
	}

}
