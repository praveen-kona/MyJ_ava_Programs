package DSA;
import java.util.*;
public class Array_Count_even_Odd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {10, 5,7,11,20,10};
		int even_count=0;
		int odd_count=0;
		int[] even=new int[arr.length];
		int[] odd=new int[arr.length];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2==0)
			{
				even_count++;
				even[i]=arr[i];
			}
			else
			{
				odd_count++;
				odd[i]=arr[i];
			}
		}
		
		int nz=0;
		int z=0;
		while(nz<even.length)
		{
			if(even[nz]!=0)
			{
				int temp=even[nz];
				even[nz]=even[z];
				even[z]=temp;
				nz++;
				z++;
			}
			else
			{
				nz++;
			}
		}
		System.out.println(Arrays.toString(Arrays.copyOf(even, even_count)));
		System.out.println("Even count is "+even_count);
		int nz1=0;
		int z1=0;
		while(nz1<odd.length)
		{
			if(odd[nz1]!=0)
			{
				int temp=odd[nz1];
				odd[nz1]=odd[z1];
				odd[z1]=temp;
				nz1++;
				z1++;
			}
			else
			{
				nz1++;
			}
		}
		System.out.println(Arrays.toString(Arrays.copyOf(odd, odd_count)));

		System.out.println("Odd count is "+odd_count);

	}

}
