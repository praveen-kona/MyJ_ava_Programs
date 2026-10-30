package Practice;

public class SubArragivenSum {

	public static void main(String[] args) {
		int[] arr= {1,4,20,3,10,5};
		int target=33;
		int sum=0;
		int left=0;
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
