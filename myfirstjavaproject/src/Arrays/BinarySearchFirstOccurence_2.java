package Arrays;

public class BinarySearchFirstOccurence_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {0,1,1,1,2,3,4,5,6};
		int target=9;
		int result=binarySearch(arr,target);
		if(result!=-1)
		{
			System.out.println("Elment found at index: "+result);
		}
		else
		{
			System.out.println("elemnt not found");
		}

	}

	public  static int binarySearch(int[] arr, int target) {
		int left=0;
		int right=arr.length-1;
		int result=-1;
		while(left<=right)
		{
			int mid=(left+right)/2;
			if(arr[mid]==target)
			{
				result=mid;
				right=mid-1;
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
		return result;
	}

}
