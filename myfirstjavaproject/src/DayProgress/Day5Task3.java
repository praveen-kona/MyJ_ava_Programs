	package DayProgress;

public class Day5Task3 
{
	static int add(int a,int b)
	{
		return a+b;
	}
	final void add(int a,int b,int c)
	{
		System.out.println(a+b+c);
	}
	private double add(double a,double b)
	{
		return a+b;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Day5Task3 d1=new Day5Task3();

		System.out.println(add(20,30));
		d1.add(10,20,30);
		System.out.println(d1.add(10.0,30.0));
	}

}
