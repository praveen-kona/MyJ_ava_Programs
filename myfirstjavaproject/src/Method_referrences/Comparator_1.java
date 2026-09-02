package Method_referrences;
import java.util.*;
public class Comparator_1 {
	static int compar(int a,int b)
	{
		return a-b;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Comparator<Integer>c=(a,b)->compar(a,b);
		System.out.println(c.compare(10, 20));
		
		Comparator<Integer>c1=Comparator_1::compar;
		System.out.println(c1.compare(10, 20));
		

	}

}
