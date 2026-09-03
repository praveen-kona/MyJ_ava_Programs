package Abstract_Classes;
abstract class Car implements Abstract_interface
{
	public void start()
	{
		System.out.println("Car payment");
	}
	void fuel()
	{
		System.out.println("fuel");
	}
}
class Concrete_1 extends Car
{
	public void stop()
	{
		System.out.println("Payemtn refund ");
	}
}
public class Class_ab_Interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Concrete_1 c=new Concrete_1();
		c.start();
		c.stop();
		c.fuel();
		

	}

}
