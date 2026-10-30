package Practice;

public class MaxdiffBetween2Elemnts {

	public static void main(String[] args) {
		int[] arr= {7,1,5,3,6,4};
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
