package Arrays;

public class BinarySearch_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {5, 10, 15, 20, 25, 25, 25};
		int target=25;
		
		int result=binarySearch(arr,target);
		if(result!=-1)
		{
			System.out.println("Element found at index:"+result);
		}
		else
		{
			System.out.println("not found");
		}

	}

	public static int binarySearch(int[] arr, int target) {
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
