package LambdaExpressions;

public class LambdaClass {

	public static void main(String[] args) {
		Interface_calculator c=(a,b) -> a+b;
		int res=c.calculate(10, 10);
		System.out.println(res);

	}

}
