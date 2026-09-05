package Abstraction;
abstract class Vehicle_1
{
	Vehicle_1()
	{
		System.out.println("Vehicle  constructor");
	}
	 abstract void start();
}
class Car_1 extends Vehicle_1
{
	Car_1()
	{
		System.out.println("Car constructor");
	}
	void start()
	{
		System.out.println("Start");
	}
}
public class Abstract_Constructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car_1 c=new Car_1();
		c.start();

	}

}
