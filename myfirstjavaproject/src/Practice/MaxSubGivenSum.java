package Practice;

public class MaxSubGivenSum {

	public static void main(String[] args) {
		int[] arr= {1,4,20,3,10,5};
		int target=33;
		int left=0;
		int sum=0;
		for(int right=0;right<arr.length;right++)
		{
			sum+=arr[right];
			while(sum>target && left<=right)
			{
				sum-=arr[left];
				left++;
			}
			if(sum==target)
			{
				for(int k=left;k<=right;k++)
				{
					System.out.print(arr[k]+" ");
				}
				System.out.println();
			}
			
		}

	}

}
