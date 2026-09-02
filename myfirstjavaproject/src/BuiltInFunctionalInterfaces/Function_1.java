package BuiltInFunctionalInterfaces;
import java.util.function.Function;
public class Function_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Function<String,Integer> f=(name)->name.length();
		System.out.println(f.apply("praveen"));
		System.out.println(f.apply("Java"));
		
		Function<Integer, Integer> doubleValue = x -> x * 2;
		System.out.println(doubleValue.apply(10));

	}

}
