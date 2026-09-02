package Abstract_Classes;
class Devloper extends Abstarct_has_constructor
{
	Devloper()
	{
		System.out.println("hello");
	}
	public void start()
	{
		System.out.println("start");
	}
}
public class Class_ab_construtor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Devloper d=new Devloper();
		d.start();

	}

}
