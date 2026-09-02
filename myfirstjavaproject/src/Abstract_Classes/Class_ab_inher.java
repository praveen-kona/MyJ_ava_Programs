package Abstract_Classes;

abstract class Another extends Abstarct_inheritance
{
	public void one()
	{
		System.out.println("One");
	}
}
class Concrerte_class extends Another
{
	public void two()
	{
		System.out.println("two");
	}
	public void three()
	{
		System.out.println("three");
	}
}
public class Class_ab_inher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Concrerte_class c=new Concrerte_class();
		c.common();
		c.one();
		c.three();
		c.two();

	}

}
