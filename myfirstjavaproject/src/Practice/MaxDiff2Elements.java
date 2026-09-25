package Practice;

public class MaxDiff2Elements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {5,5};
		int minnumber=arr[0];
		
		int maxdiff=0;
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i]<=minnumber)
			{
				minnumber=arr[i];
			}
			else 
			{
				int mindiff=arr[i]-minnumber;
				if(mindiff>maxdiff)
				{
					maxdiff=mindiff;
				}

			}
		}
		System.out.println(maxdiff);

	}

}
