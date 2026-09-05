package DSA;
import java.util.*;
public class Array_Count_even_Odd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {-10, -5, 0, 7, 12, 15};
		int even_count=0;
		int odd_count=0;
		int ei = 0;
		int oi = 0;
		int[] even=new int[arr.length];
		int[] odd=new int[arr.length];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2==0)
			{
				even_count++;
				even[ei]=arr[i];
				ei++;
			}
			else
			{
				odd_count++;
				odd[oi]=arr[i];
				oi++;
			}
		}
		
		
		System.out.println(Arrays.toString(Arrays.copyOf(even, even_count)));
		System.out.println("Even count is "+even_count);
		
		System.out.println(Arrays.toString(Arrays.copyOf(odd, odd_count)));

		System.out.println("Odd count is "+odd_count);

	}

}
