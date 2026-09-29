package Practice;

public class BinSearchLastOccur {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr= {1,1,3,4,5};
		int target=1;
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
			else
				if(arr[mid]>target)
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
			System.out.println("elemnt found art :"+res);
		}
		else
		{
			System.out.println(res);
		}
	}

}
