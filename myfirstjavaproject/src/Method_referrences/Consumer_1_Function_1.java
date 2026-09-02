package Method_referrences;
import java.util.function.*;
public class Consumer_1_Function_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Consumer<String> c=System.out::println;
		c.accept("praveen");
		
		Function<String,Integer> f=String::length;
		f.apply("praveen");

	}

}
