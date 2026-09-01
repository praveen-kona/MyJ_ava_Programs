package Interfaces;

public class Class_Interface1 implements Interface1
{
	public void pay()
	{
		System.out.println("payment through UPI");
	}

	public static void main(String[] args) {
		Class_Interface1 c=new Class_Interface1();
		c.pay();


	}

}
