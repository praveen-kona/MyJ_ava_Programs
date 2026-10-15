package Collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;



public class CollectionInterface_Iterator {

	static int n;
	public static void main(String[] args) {


		System.out.println(n);
		Collection<Object> c=new ArrayList<>();
		List<Integer> l=new ArrayList<>();
		
		l.add(0,10);
		
		c.add(1);
		c.add(2);
		c.add(3);
		c.add(4);
		Iterator<Object> itr=c.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		for(Object obj:c)
		{
			System.out.println(obj);
		}


	}

}
