package Collections;

import java.util.ArrayList;
import java.util.Collection;

public class COllectionInterface5 {

	public static 
	void main(String[] args) {

Collection<Object> c=new ArrayList<>();

c.add(1);
c.add(2);

Collection<Object> c2=new ArrayList<>();
c2.add("hello");
c2.add("hi");
Collection<Object> c3=new ArrayList<>();

c3.add(c2);
c3.add(c);
System.out.println(c3);
c3.removeAll(c2);
System.out.println(c3);
c3.clear();
System.out.println(c3);

	}

}
