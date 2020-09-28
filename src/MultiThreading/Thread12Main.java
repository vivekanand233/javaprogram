package MultiThreading;

public class Thread12Main {

	public static void main(String[] args) {
		
		Thread12 thread=new Thread12();
		thread.setName("tread 1 ");
		thread.start();
		
		Thread12 threado=new Thread12();
		threado.setName("thread 2 ");
		threado.start();
		
		for(int i=0;i<=5;i++)
			
		{
			System.out.println("this is main Thread");
		}
		

		
		
		
	}

}
