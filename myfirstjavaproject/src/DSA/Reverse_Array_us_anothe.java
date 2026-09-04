package DSA;
import java.util.*;
public class Reverse_Array_us_anothe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,3,4,5};
		int[] rev=new int[arr.length];
		int j=0;
		for(int i=arr.length-1;i>=0;i--)
		{
			rev[j]=arr[i];
			j++;
		}
		System.out.println(Arrays.toString(rev));

	}

}
