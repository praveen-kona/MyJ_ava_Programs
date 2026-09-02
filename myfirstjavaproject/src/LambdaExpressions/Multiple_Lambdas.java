package LambdaExpressions;
@FunctionalInterface
interface Message
{
	void show();
}
@FunctionalInterface
interface Square
{
	int calculate(int x);
}
@FunctionalInterface
interface Calculator
{
	int calculate(int a, int b);
}
public class Multiple_Lambdas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Message m= ()->  System.out.println("Hello");
		m.show();
		Square s=x -> x*x;
		System.out.println(s.calculate(10));
		
		Calculator c=(a,b) ->  a+b;
		System.out.println(c.calculate(10,20));

	}

}
