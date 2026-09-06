package Abstraction;
interface Vehicle_2
{
	void start();
	void stop();
	
}
abstract class Car_2 implements Vehicle_2
{
	public void start()
	{
		System.out.println("Start");
	}
}
class Cocrete extends Car_2
{
	public void stop()
	{
		System.out.println("stop");
	}
}
public class Abstract_Interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cocrete c=new Cocrete();
		c.start();
		c.stop();

	}

}
