package LambdaExpressions;
@FunctionalInterface
interface Parameter
{
	void add(int a);
}
public class LambdsFor_parametrs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parameter p=a ->
		{
			System.out.println(a);
		};
		p.add(10);

	}

}
