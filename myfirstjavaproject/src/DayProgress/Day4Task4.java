package DayProgress;
final class  Super
{
	void display()
	{
		System.out.println("Hell this is final super class ;");
	}
}
//class Sub extends Super  //The type Sub cannot subclass the final class Supe
class Sub
{
	void display()
	{
		System.out.println("hello");
	}
}
public class Day4Task4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Super s1=new Super();
		s1.display();
	

	}

}
