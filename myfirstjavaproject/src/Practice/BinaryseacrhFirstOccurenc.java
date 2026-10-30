package Practice;

public class BinaryseacrhFirstOccurenc {

	public static void main(String[] args) {
		int[] arr= {1,2,2,3,3,4};
		int left=0;
		int right=arr.length-1;
		int index=-1;
		int target=2;
		while(left<=right)
		{
			int mid=(left+right)/2;
			if(arr[mid]==target)
			{
				index=mid;
				left=mid+1;
				
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
			System.out.println("yes at "+index);
		}
		else
		{
			System.out.println("not at "+index);
		}

	}

}
