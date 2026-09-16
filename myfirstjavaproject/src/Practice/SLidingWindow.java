package Practice;

public class SLidingWindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {2, 1, 5, 1, 3, 2};
		
		int	k=3;
		int sum=0;
		for(int i=0;i<k;i++)
		{
			sum+=arr[i];
		}
		int max=sum;
			for(int j=k;j<arr.length;j++)
			{
				sum=sum-arr[j-k]+arr[j];
			if(sum>max)
			{
				max=sum;
				
			}
		}
		System.out.println(max);
		

	}

}
