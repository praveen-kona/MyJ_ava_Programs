package Arrays;

public class MaxSubArraySum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {-2, 1, -3, 4, -1, 2, 1, -5, 4};
		int max=Integer.MIN_VALUE;
		int count=0;
		int target=5;
		for(int i=0;i<arr.length;i++) {
			for(int j=i;j<arr.length;j++)
			{
				int sum=0;
				
				for(int k=i;k<=j;k++)
				{
					sum+=arr[k];
					
				}
				System.out.println(sum);
				if(sum==target)
				{
					count++;
				}

				if(sum>max)
				{
					max=sum;
				}
			}
			
		}
		System.out.println(max);
		System.out.println(count+"count");

	}

}
