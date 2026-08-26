package DayProgress;
class AccessTest
{
	private int a = 10;
	int b = 20;
	protected int c = 30;
	public int d = 40;
	void display()
	{
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
	}
}
public class Day6Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AccessTest a1=new AccessTest();
		a1.display();
	}

}
