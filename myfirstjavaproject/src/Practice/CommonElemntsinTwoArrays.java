package Practice;

public class CommonElemntsinTwoArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1= {1,2,3,4,5};
		int[] arr2= {3,3,5,6,7};
		for(int i=0;i<arr1.length;i++)
		{
			int count=0;
			for(int j=0;j<arr2.length;j++)
			{
				if(arr1[i]==arr2[j])
				{
					count++;
				}
			}
			if(count==1||count>=1)
			{
				System.out.println(arr1[i]);
			}
		}

	}

}
