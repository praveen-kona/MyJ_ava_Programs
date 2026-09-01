package Interfaces;

public class Class_Interface_extends_interface implements Dog{
	public void eat()
	{
		System.out.println("eating");
	}
	public void bark()
	{
		System.out.println("barking");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Class_Interface_extends_interface c=new Class_Interface_extends_interface();
		c.eat();
		c.bark();

	}

}
