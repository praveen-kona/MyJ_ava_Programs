package LambdaExpressions;


@FunctionalInterface
interface MoreParams
{
	public abstract void hello(int a,String name,double salary);
}
public class LambdsFor_moreParameers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MoreParams m=(int a,String name,double salary) -> 
		{
			int age=22;
			System.out.println("person in integer "+a);
			System.out.println("Person name :"+name);
			System.out.println("Person salary :"+salary);
			System.out.println("Person age"+age);
		};
		m.hello(2, "praveen", 788749.09);

	}

}
