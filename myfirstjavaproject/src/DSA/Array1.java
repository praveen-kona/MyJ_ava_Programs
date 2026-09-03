package DSA;
import java.util.*;
public class Array1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {10,20,30,40};
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		System.out.println(arr[3]); //accessing
		
		// updating
		arr[3]=35;
		System.out.println(arr[3]);
		System.out.println(Arrays.toString(arr));

	}

}
