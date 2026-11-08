package MultiThreading;

public class FirstWayOfCreatingThread extends Thread implements Runnable {

	public static void main(String[] args) {
		FirstWayOfCreatingThread v=new FirstWayOfCreatingThread();
		v.start();

		for(int i=0;i<=10;i++)
		{
			System.out.println("main : "+i);
		}

	}
	public void run()
	{
		for(int i=0;i<=10;i++)
		{
			System.out.println("run : "+i);
		}
	
	}

}
