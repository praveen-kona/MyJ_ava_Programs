package MultiThreading;

public class SecondWayOfCreatinThread implements Runnable {

	public static void main(String[] args) {
		

		SecondWayOfCreatinThread s=new SecondWayOfCreatinThread();
		Thread t=new Thread(s);
		t.start();
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
