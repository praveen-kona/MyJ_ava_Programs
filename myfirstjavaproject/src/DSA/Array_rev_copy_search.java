package DSA;
import java.util.*;
public class Array_rev_copy_search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {10,20,30,10};
		int search=10;
		int search_index=-1;
		int max=a[0];
		int count=0;
		int[] c=a.clone();
		
		for(int start=0,
				end=a.length-1;end>start;start++,end--)
		{
			int temp=a[start];
			a[start]=a[end];
			a[end]=temp;
			
		}
		System.out.println(Arrays.toString(c));
		System.out.println(Arrays.toString(a));
		for(int i=0;i<a.length;i++)
		{
			
			if(a[i]>max)
			{
				max=a[i];
			}
		}
		System.out.println(max);
		for(int i=0;i<c.length;i++)
		{
			if(c[i]==search && search_index==-1 )
			{
				search_index=i;
				System.out.println(c[i]+" is at index at "+search_index);
			}
			if(c[i]>0)
			{
				count++;
			}
		}
		System.out.println(count);
		

	}

}
