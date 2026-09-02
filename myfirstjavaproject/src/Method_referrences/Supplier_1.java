package Method_referrences;
import java.util.function.*;
public class Supplier_1 {
	static String getName()
	{
		return "praveen";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Supplier<String> s=Supplier_1::getName;
		System.out.println(s.get());

	}

}
