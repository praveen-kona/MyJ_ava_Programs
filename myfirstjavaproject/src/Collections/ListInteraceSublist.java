package Collections;

import java.util.ArrayList;
import java.util.List;

public class ListInteraceSublist {

	public static void main(String[] args) {
		List<Integer>l=new ArrayList<>();
		l.add(10);
		l.add(20);
		List<Integer> l1=l.subList(0, 2);
		System.out.println(l1);
		l1.add(30);
		System.out.println(l);
		System.out.println(l1);

	}

}
