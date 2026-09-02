package LambdaExpressions;
@FunctionalInterface
interface Simple
{
	int add(int a,String b);
}
public class Lambda_for_simple_body {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Simple s=(a,b) -> {
			System.out.println(b);
			return a;
			
		};

		System.out.println(s.add(10, "Praveen"));
	}

}
