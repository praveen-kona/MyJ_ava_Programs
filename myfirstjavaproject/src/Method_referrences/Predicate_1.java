package Method_referrences;
import java.util.function.*;
public class Predicate_1 {
public static boolean isgreater(int num)
{
	return num>10;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Predicate<Integer> p=Predicate_1::isgreater;
		System.out.println(p.test(10));

	}

}
