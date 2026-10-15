package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListInterface {

	public static void main(String[] args) {
		List<Integer> l=new ArrayList<>();
		l.add(1);
		l.add(2);
		l.add(1);
//		l.add(null);
//		l.add(null);
		System.out.println(l);
		l.add(2);
		
		System.out.println(l);
		Collections.sort(l);
		System.out.println(l);
	}

}
