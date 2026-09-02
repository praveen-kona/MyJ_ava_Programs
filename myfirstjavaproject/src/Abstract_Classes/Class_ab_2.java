package Abstract_Classes;
abstract class Dog extends Abstarct_class_2
{
	public void sound()
	{
		System.out.println("sound engineer ");
	}
	abstract void move();
}
class Puppy extends Dog
{
	public void move()
	{
		System.out.println("moving");
	}
}
public class Class_ab_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Puppy p=new Puppy();
		p.sound();
		p.move();
		p.eat();

	}

}
