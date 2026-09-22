package Arrays;

public class BinarySearch_LastOccurenec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,3,4,5,5,6};
		int target=5;
		int left=0;
		int right=arr.length-1;
		int res=-1;
		while(left<=right)
		{
			int mid=(left+right)/2;
			if(arr[mid]==target)
			{
				res=mid;
				left=mid+1;
			}
			else if(arr[mid]>target)
			{
				right=mid-1;
			}
			else
			{
				left=mid+1;
			}
		}
		if(res!=-1)
		{
			System.out.println("Elemnt found at index : "+res);
		}
		else
		{
			System.out.println("not");
		}

	}

}
