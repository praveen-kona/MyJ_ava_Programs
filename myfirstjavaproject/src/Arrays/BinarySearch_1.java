package Arrays;

public class BinarySearch_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,3,4,5};
		int target=2;
		int left=0;
		int right=arr.length-1;
		int index=-1;
		while(left<=right)
		{
			int mid=(left+right)/2;
			if(arr[mid]==target)
			{
				System.out.println(target+" element  is found ");
				index=mid;
				break;
			}
			else if(arr[mid]<target)
				{
					left=mid+1;
				}
				else if(arr[mid]>target)
				{
					right=mid-1;
				}
				else
				{
					System.out.println("not");
				}	
			}
		if(index!=-1)
		{
			System.out.println("Element found at index: "+index);
		}
		else
		{
			System.out.println("not");
		}

	}

}
