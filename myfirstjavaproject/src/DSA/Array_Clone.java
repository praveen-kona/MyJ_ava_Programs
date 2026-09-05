package DSA;

import java.util.*;

public class Array_Clone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {10, 20, 30}; 
		int[] b=a.clone();
		b[0]=100;
		System.out.println(a[0]);
		
		int[] d = {10, 20, 30}; 
		
		int[] c=b.clone();
		b[0]=40;
		System.out.println(d[0]);

	}

}
