package ArraysandStrings;

public class IntersectionorCommonof2Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1= {1,2,3};
		int[] arr2= {4,5,3};
		for(int i=0;i<arr1.length;i++)
		{
			boolean isfound=false;
			for(int k=0;k<i;k++)
			{
				if(arr1[i]==arr1[k])
				{
					isfound=true;
					break;
				}
			}
			if(isfound)
				continue;
			int count=1;
			for(int j=0;j<arr2.length;j++)
			{
				if(arr1[i]==arr2[j])
				{
					count++;
				}
			}
			if(count>1)
			{
				System.out.println(arr1[i]);
			}
		}

	}

}
