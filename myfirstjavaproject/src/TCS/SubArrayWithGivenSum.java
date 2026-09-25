package TCS;

public class SubArrayWithGivenSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,3};
		int left=0;
		int sum=0;
		int target=3;
		int count=0;
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
				count++;
				for(int i=left;i<=right;i++)
				{
					System.out.print(arr[i]);
					
				}
			}
		}
		System.out.println();
		System.out.println(count);

	}

}
