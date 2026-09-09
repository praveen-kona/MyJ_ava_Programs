package Practice;
import java.util.*;
public class MergeTwoSortedArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1= {1, 3, 5, 7};
		int[] arr2= {2, 4, 6, 8};
		int[] sort=new int[arr1.length+arr2.length];
		for(int i=0;i<arr1.length;i++)
		{
			sort[i]=arr1[i];
		}
		for(int i=0;i<arr2.length;i++)
		{
			sort[i+4]=arr2[i];
		}
		for(int i=0;i<sort.length-1;i++)
		{
			for(int j=0;j<sort.length-1-i;j++)
			{
				if(sort[j]>sort[j+1])
				{
					int temp=sort[j];
					sort[j]=sort[j+1];
					sort[j+1]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(sort));
		

	}

}
