package Collections;

import java.util.ArrayList;
import java.util.List;

public class ListInterface2 {

	public static void main(String[] args) {


		List<Integer>l=new ArrayList<>();
		l.add(1);
		l.add(2);
		l.add(3);
		System.out.println(l.get(2));
		l.remove(2);
		System.out.println(l);
		
		for(int i=0;i<l.size();i++)
		{
			System.out.println(l.get(i));
		}
		

	}

}
