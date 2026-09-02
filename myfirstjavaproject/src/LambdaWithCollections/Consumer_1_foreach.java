package LambdaWithCollections;
import java.util.*;
public class Consumer_1_foreach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> names=Arrays.asList("praveen","rahul","kiran");
		names.forEach(name->System.out.print(name+" "));
		System.out.println();
		names.forEach(System.out::print);
		

	}

}
