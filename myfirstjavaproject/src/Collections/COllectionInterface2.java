package Collections;

import java.util.ArrayList;
import java.util.Collection;

public class COllectionInterface2 {

	public static void main(String[] args) {


		Collection<Integer> c=new ArrayList<>();
		c.add(1);
		c.add(2);
		c.add(3);
		Collection<Integer> c1=new ArrayList<>();
		
		c1.add(3);
		c1.add(4);
		c1.add(5);
		
		Collection<Integer> c3=new ArrayList<>();

		c3.addAll(c);
		c3.addAll(c);
		System.out.println(c3);
	}

}
