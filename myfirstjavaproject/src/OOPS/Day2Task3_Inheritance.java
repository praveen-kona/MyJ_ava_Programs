package OOPS;

class Animal
{
	void eat()
	{
		System.out.println("eating");
	}
	void sleep()
	{
		System.out.println("sleeping");
	}
}
class Dog extends Animal
{
	void bark()
	{
		System.out.println("barking");
	}
}
public class Day2Task3_Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog d=new Dog();
		d.bark();
		d.sleep();
		d.eat();

	}

}
