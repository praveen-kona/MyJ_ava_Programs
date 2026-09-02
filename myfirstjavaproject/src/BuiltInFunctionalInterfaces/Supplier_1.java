package BuiltInFunctionalInterfaces;
import java.util.function.Supplier;
public class Supplier_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Supplier<String> s =() -> "hello";
		System.out.println(s.get());
		Supplier<Integer> s1=()->100;
		System.out.println(s1.get());
		

	}

}
