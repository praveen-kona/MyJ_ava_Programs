package Collections;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionInterface_hashcodeMethos {

	public static void main(String[] args) {


		Collection<Object> c=new ArrayList<>();
		System.out.println(c.hashCode());
		c.add(10);
		c.add(20);
		System.out.println(c);
		System.out.println(c.hashCode());
		Collection<Object> c1=new ArrayList<>();
		System.out.println(c1.hashCode());
		c1.add(20);
		c1.add(10);
		System.out.println(c1.hashCode());
	}

}
