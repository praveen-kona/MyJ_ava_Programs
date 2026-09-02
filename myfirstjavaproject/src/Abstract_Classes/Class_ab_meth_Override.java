package Abstract_Classes;
class B extends Abstract_mehtod_overrinding
{
	@Override
	public void sound()
	{
		System.out.println("Sound");
	}
	void bark()
	{
		System.out.println("barking");
	}
}
class C extends Abstract_mehtod_overrinding
{
	@Override
	public void sound()
	{
		System.out.println("another sound");
	}
	void meow()
	{
		System.out.println("Meow");
	}
}
public class Class_ab_meth_Override {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B d=new B();
		d.sound();
		d.bark();
		C c=new C();
		c.sound();
		c.meow(); 
		/*Abstract_mehtod_overrinding a;// runtime polymorphism
		a=new B();
		a.sound();
		a=new C();
		a.sound();
		*/

	}

}
