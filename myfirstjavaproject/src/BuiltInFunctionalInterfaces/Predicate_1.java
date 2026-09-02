package BuiltInFunctionalInterfaces;
import java.util.function.Predicate;
public class Predicate_1 
{
	

	public static void main(String[] args) {

        // Create a Predicate
        Predicate<Integer> p = (x) -> x%2==0;

        // Test values
        System.out.println(p.test(10));
        System.out.println(p.test(7));
    }
}
