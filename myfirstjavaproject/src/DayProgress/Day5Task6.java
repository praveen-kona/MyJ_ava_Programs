package DayProgress;
class This
{
	int age;
	void shoe(int age)
	{
		this.age=age;
		// used when instnace varibale and parmametr is same
		System.out.println("age :"+age);
	}
	int num;
	void display(int n)
	{
		num=n; // here we don't need to use this keyword
		System.out.println("num :"+num);
		System.out.println("num :"+n);
	}
}
public class Day5Task6 
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	  This t=new This();
	  t.shoe(21);
	  t.display(23);

	}

}
