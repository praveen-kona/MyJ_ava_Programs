package Practice;

public class BinSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,3,4,5};
		
		int target=90;
		int left=0;
		int right=arr.length-1;
		int index=-1;
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
			System.out.println("elemnt found at :"+index);
		}
		else
		{
			System.out.println(index);
		}

	}

}
