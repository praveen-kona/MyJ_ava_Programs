package Arrays;

public class BinarySearch_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,3,4,5,6,7,8,9};
		int target=9;
		BinarySearch_2 b=new BinarySearch_2();
		;
		if(b.binarySearch(arr, target)!=-1)
		{
			System.out.println("element found at index: "+b.binarySearch(arr, target));
		}
		else
		{
			System.out.println("not"+b.binarySearch(arr, target));
		}

	}

	public  int binarySearch(int[] arr, int target) {
		int left=0;
		int right=arr.length-1;
		while(left<=right)
		{
			int mid=(left+right)/2;
			if(arr[mid]==target)
			{
				return mid;
			}
			else if(arr[mid]<target)
			{
				left=mid+1;
			}
			else
			{
				right=mid-1;
			}
		}
		return -1;
	}

}
