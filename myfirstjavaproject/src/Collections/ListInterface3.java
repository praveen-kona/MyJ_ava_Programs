package Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListInterface3 {

	public static void main(String[] args) {

		List<Integer> s=new ArrayList<>();

		s.add(1);
		s.add(2);
		s.add(3);
		Iterator<Integer> itr=s.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		ListIterator<Integer> litr=s.listIterator(s.size());
		while(litr.hasPrevious())
		{
			System.out.println(litr.previous());
		}
		
		

	}

}
