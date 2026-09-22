package TCS;

public class MaxSubsumKadanesAlgortuhm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {-5};
		int max=arr[0];
		int sum=arr[0];
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i]+sum>arr[i])
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
