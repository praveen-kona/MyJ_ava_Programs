package Abstract_Classes;
class Concrete extends Abstarct_with_concretemethods
{
	public void hello()
	{
		System.out.println("hello");
	}
	public void hi()
	{
		System.out.println("hi");
	}
	void stop()
	{
		System.out.println("Stop");
	}
}
//driver class
public class Class_ab_concrete  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Concrete c=new Concrete();
		c.hello();
		c.hi();
		c.start();
		c.stop();
		
		

	}

}
