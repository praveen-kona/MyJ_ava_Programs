package Interfaces;
interface Payment_1
{
	void pay();
}
class Upi_1 implements Payment_1
{
	public void pay()
	{
		System.out.println("upi payment");
	}
	void scanQR()
	{
	    System.out.println("Scanning QR");
	}
}
class Card_1 implements Payment_1
{
	public void pay()
	{
		System.out.println("card payment");
	}
	void pin()
	{
	    System.out.println("entering pin");
	}
}

public class Class_interface_upcasting_and_Downcasting {

	public static void main(String[] args) {
		
		Payment_1 p=new Upi_1();
		
		//
		Upi_1 u1=new Upi_1();
		Payment_1 p2=u1;
		p2.pay(); 
		p.pay();
		((Upi_1)p).scanQR();
		
		// or
		
		Upi_1 u=(Upi_1)p;
		u.scanQR();
		u.pay();
		
		
		Payment_1 p3;
		p3=new Card_1();
		p3.pay();
		
		Card_1 c=(Card_1)p3;
		c.pay();
		c.pin();

	}

}
