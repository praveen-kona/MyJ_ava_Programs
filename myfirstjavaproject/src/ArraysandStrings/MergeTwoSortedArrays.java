package ArraysandStrings;

public class MergeTwoSortedArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1= {3,4,5};
		int[] arr2= {1};

		int[] merge=new int[arr1.length+arr2.length];
		
		int i=0;int j=0;
		for(int k=0;k<merge.length;k++)
		{
			if(i<arr1.length && j< arr2.length)
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
		for(int k=0;k<merge.length;k++)
		{
			System.out.print(merge[k]+" ");
		}

	}

}
