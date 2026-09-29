package Practice;

public class BinSearchFirstOcc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,2,3,4,5};
		int target=2;
		int left=0;
		int right=arr.length-1;
		int res=-1;
		while(left<=right)
		{
			int mid=(left+right)/2;
			if(arr[mid]==target)
			{
				res=mid;
				right=mid-1;
			}
			else if (arr[mid]<target)
			{
				left=mid+1;
			}
			else
			{
				right=mid-1;
			}
		}
		if(res!=-1)
		{
			System.out.println("Element found at : "+res);
		}
		else
		{
			System.out.println(res);
		}

	}

}
