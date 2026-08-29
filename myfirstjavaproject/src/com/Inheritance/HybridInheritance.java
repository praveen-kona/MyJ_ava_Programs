package com.Inheritance;
interface Fare
{
	default void fareInfor()
	{
		System.out.println("this is default mehtod in interface ");
	}
}


// single 
class Car extends Vehicle 
{
	   void  carType()
	   {
		   System.out.println("car type");
	   }
} 
// hiearchical 
// hybrid
class Bus extends Vehicle implements Fare
{
	void busType()
	{
		System.out.println("bus type");
	}
}
// mutilevel
class Enginee extends Car
{
	void engineType()
	{
		System.out.println("engine start");
	}
}

public class HybridInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Enginee e=new Enginee();
		Bus b=new Bus();
		b.fareInfor();
		Car c=new Car();
		c.carType();
		e.engineType();
		e.carType();
		e.vehicleType();
		b.vehicleType();
		
		
		

	}

}
