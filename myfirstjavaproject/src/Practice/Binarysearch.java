package Practice;

public class Binarysearch {

	public static void main(String[] args) {


		int[] arr= {1,2,3,4,5};
		int target=3;
		int left=0;
		int index=-1;
		int right=arr.length-1;
		while(left<=right)
		{
			int mid=(left+right)/2;
			if(arr[mid]==target)
			{
				index=mid;
				break;
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
		if(index!=-1)
		{
			System.out.println("elemnt at "+index);
		}
		else
		{
			System.out.println(index);
		}
		

	}

}
