package DayProgress;
class Test
{
	static int staticValue = 100;
	int instanceValue = 200;
	static void staticMethod()
	{
		System.out.println(staticValue);
	}
	void instanceMethod()
	{
		System.out.println(instanceValue);
	}
}
public class Day5Task5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test t=new Test();
		Test.staticMethod();
		t.instanceMethod();

	}

}
