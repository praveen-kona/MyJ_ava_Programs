package Interfaces;

public class Class_Interface_default_method_2 implements Interface_5
{
	@Override
	public void payment()
	{
		System.out.println("UPI Payment !");
		Interface_5.super.payment();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Class_Interface_default_method_2 c=new Class_Interface_default_method_2();
		c.payment();
		

	}

}
