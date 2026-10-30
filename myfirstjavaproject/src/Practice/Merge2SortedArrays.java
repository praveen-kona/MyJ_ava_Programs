package Practice;

import java.util.Arrays;

public class Merge2SortedArrays {

	public static void main(String[] args) {
		int[] arr1= {1,3,4};
		int[] arr2= {2,4,5};
		int i=0;
		int j=0;
		int[] merge=new int[arr1.length+arr2.length];
		for(int k=0;k<merge.length;k++)
		{
			if(i<arr1.length && j<arr2.length)
			{
				if(arr1[i]<arr2[j])
				{
					merge[k]=arr1[i];
					i++;
				}
				else
				{
					merge[k]=arr2[j];
					j++;
				}
			}
			else if(i<arr1.length)
			{
				merge[k]=arr1[i];
				i++;
			}
			else
			{
				merge[k]=arr2[j];
				j++;
			}
		}
		System.out.println(Arrays.toString(merge));

	}

}
