package MultiThreading;

public class Task1 {

	public static void main(String[] args) {
		System.out.println(Thread.currentThread());
		Task1 t=new Task1();
		t.hello();
		t.Welcome();
		t.How();

	}
	
	void hello()
	{
		System.out.println("Hello method Called");
		System.out.println(Thread.currentThread());
	}
	void Welcome()
	{
		System.out.println("Hello method Called");
		System.out.println(Thread.currentThread());
	}

	void How()
	{
		System.out.println("Hello method Called");
		System.out.println(Thread.currentThread());
	}


}
