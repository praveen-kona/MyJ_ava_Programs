package AnonymousClasses;
abstract class Animal_1
{
	abstract void sound();
	
	void eat()
	{
		System.out.println("Animal eats");
	}
}
public class AbstractClass_with_AbstractClasses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal_1 a=new Animal_1()  //concrete class
		{
			@Override
			public void sound()
			{
				System.out.println("Dog barks");
			}
		};
		a.sound();
		a.eat();

	}

}
