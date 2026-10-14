package Collections;

import java.util.ArrayList;
import java.util.Collection;

public class COllectionInterface4 {

	public static void main(String[] args) {
		Collection<Object> c=new ArrayList<>();
		c.add("hello");
		Collection<Object> c2=new ArrayList<>();

		c2.add('c');
		Collection<Object> c3=new ArrayList<>();
c3.add(c);
c3.add(c2);
System.out.println(c3);
c3.remove(c2);
System.out.println(c3);
	}
	

}
