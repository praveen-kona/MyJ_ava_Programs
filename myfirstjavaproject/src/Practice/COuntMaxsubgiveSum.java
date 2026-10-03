package Practice;

public class COuntMaxsubgiveSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,-1,2,3,-2};
		int left=0;
		int sum=0;
		int target=3;
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
				for(int i=left;i<=right;i++)
				{
					System.out.println(arr[i]);
				}
			}
		}
	}

}
