package Collections;

import java.util.ArrayList;
import java.util.Collection;

public class COllectInterIsEmptyMethos {

	public static void main(String[] args) {


		Collection<Object> c=new ArrayList<>();
		c.add(1);
		if(c.isEmpty())
		{
			c.add(1);
			c.add(2);
		}
		else
		{
			System.out.println("already it is filled");
		}
		System.out.println(c);

	}

}
