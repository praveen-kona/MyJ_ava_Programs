package LambdaExpressions;
@FunctionalInterface
interface Conditions{
	void print();
}
public class Lalmbdawithconditons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Conditions c=() ->
		{
			int speed=100;
			if(speed>=100)
				System.out.println("Speed at "+speed);
			else
				System.out.println("Not match");
		};c.print();
		

	}

}
