package Assignment;
class Vehicle
{
	int speed=50;
	void display()
	{
		System.out.println("this is parent class method");
	}
}
class Car extends Vehicle
{
	int speed =100;
	
	@Override
	void display()
	{
		System.out.println("Child override parent method");
	}
}
public class Inheritnace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle v=new Car();
		System.out.println(v.speed);
		v.display();

	}

}
