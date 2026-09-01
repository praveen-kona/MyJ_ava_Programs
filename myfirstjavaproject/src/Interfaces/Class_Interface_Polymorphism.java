package Interfaces;
interface Payment
{
	
	void pay();
}
class Upi implements Payment
{
	public void pay()
	{
		System.out.println("UPI payment");
	}
	
}
class Card implements Payment
{
	public void pay()
	{
		System.out.println("card payment");
	}
}
public class Class_Interface_Polymorphism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Payment p;
		p=new Upi();
		p.pay();
		
		p=new Card();
		p.pay();

	}

}
