package DSA;
import java.util.*;
public class Array_copyOf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {10,20,30,40};
		int[] b=Arrays.copyOf(a,2);
		System.out.println(Arrays.toString(b));
		int[] c=Arrays.copyOf(a,a.length);
		System.out.println(Arrays.toString(c));

	}

}
