package MultiThreading;


public class Task2 extends Thread{

	public static void main(String[] args)  {
		Task2 t=new Task2();
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
			System.out.println("hello : "+i);
		}
	}

}
