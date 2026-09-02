package Method_referrences;
import java.util.function.*;
public class Function_1 {
	static int Length(String name)
	{
		return name.length();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Function<String,Integer> f=Function_1::Length;
		System.out.println(f.apply("praveen"));

	}

}
