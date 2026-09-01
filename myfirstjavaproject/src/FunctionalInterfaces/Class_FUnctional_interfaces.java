package FunctionalInterfaces;
@FunctionalInterface
interface Calculator
{
	public abstract int calculate(int a,int b);
	default void show()
	{
		System.out.println("Calculator");
	}
}
class Operation implements Calculator
{
	@Override
	public int calculate(int a,int b)
	{
		return a+b;
	}
}
public class Class_FUnctional_interfaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Operation v=new Operation();
		System.out.println(v.calculate(10, 20));
		v.show();

	}

}
