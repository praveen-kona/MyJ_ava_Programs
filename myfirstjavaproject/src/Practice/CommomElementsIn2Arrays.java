package Practice;

public class CommomElementsIn2Arrays {

	public static void main(String[] args) {
		int[] arr1= {1,2,2,2,3};
		int[] arr2= {3,3,2,2,4};
		for(int i=0;i<arr1.length;i++)
		{
			boolean isfound=false;
			
			for(int j=0;j<arr2.length;j++)
			{
				if(arr1[i]==arr2[j])
				{
					isfound=true;
					break;
				}
			}
			if(isfound)
				System.out.println(arr1[i]);
		}

	}

}
