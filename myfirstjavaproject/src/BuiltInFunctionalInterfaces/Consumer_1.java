package BuiltInFunctionalInterfaces;
import java.util.function.Consumer;
public class Consumer_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Consumer<String> c= name -> System.out.println("Hello "+name);

		c.accept("praveen");
		c.accept("Java");
	}

}
