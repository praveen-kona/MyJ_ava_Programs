package TCS;

public class MaxSubsum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,3,4,5};
		int max=arr[0];
		int sum=arr[0];
		for(int i=1;i<arr.length;i++)
		{
			if(sum+arr[i]>arr[i])
			{
				sum+=arr[i];
			}
			else
			{
				sum=arr[i];
			}
			if(sum>max)
			{
				max=sum;
			}
		}
		System.out.println(max);

	}

}
