package Method_referrences;
import java.util.function.*;
public class Cosumer_1 {
	public static void printName(String name)
	{
		System.out.println(name);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Consumer<String> s=Cosumer_1::printName;
		s.accept("praveen");

	}

}
