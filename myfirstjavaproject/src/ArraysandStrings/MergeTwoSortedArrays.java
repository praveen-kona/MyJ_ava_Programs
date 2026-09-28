package ArraysandStrings;

public class MergeTwoSortedArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1= {1,4};
		int[] arr2= {2,2,2,3};

		int[] merge=new int[arr1.length+arr2.length];
		
		int i=0;int j=0;
		for(int k=0;k<merge.length;k++)
		{
			boolean isfound=false;
			for(int l=0;l<i;l++)
			{
				if(merge[k]==merge[l])
				{
					isfound=true;
					break;
				}
			}
			if(isfound)
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
