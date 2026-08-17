package Arrays;

public class MinandMaxElemntinanArray {

	public static void main(String[] args) {
		int[] arr= {2,1,4,5,3,6};
		int max=arr[0];
		int min=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
				
			}
			else if(arr[i] < min)
			{
				min=arr[i];
				
			}
		}
		System.out.println(max);
		System.out.println(min);

		System.out.println();
		
		// for each loop
		int min1=arr[0];
		int max1=arr[1];
		for(int a:arr)
		{
			if(a>max1)
			{
				max1=a;
			}
			else if(a<min1)
			{
				min1=a;
			}
			
		}
		System.out.println(max1);
		System.out.println(min1);
	}

}
