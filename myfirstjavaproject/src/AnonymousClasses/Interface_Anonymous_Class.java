package AnonymousClasses;
interface Animal
{
	void sound();
}

public class Interface_Anonymous_Class {

	public static void main(String[] args) {
		Animal a=new Animal()
		{    
			@Override
			public void sound()
			{
				System.out.println("Dog barks");
			}
		};
		a.sound();
		// TODO Auto-generated method stub

	}

}
