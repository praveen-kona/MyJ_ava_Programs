package Abstract_Classes;
class Upi extends Abstract_polymorphism
{
	public void pay()
	{
		System.out.println("upi payment");
	}
	
	void shhow()
	{
		System.out.println("show");
	}
}
class Card extends Abstract_polymorphism
{
	public void pay()
	{
		System.out.println("card payment");
	}
}
public class Class_ab_polymor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Abstract_polymorphism a;
		a=new Upi();
		a.pay();
		
		a=new Card();
		a.pay();

		
		// cant we call another own concrete method in concrete class like show() method
		

	}

}
