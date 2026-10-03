package Practice;

public class MaxDiff2Elemnts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {7,1,5,3,6,4};
		int maxdif=0;
		int min=arr[0];
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i]<=min)
			{
				min=arr[i];
			}
			else
			{
				int mindiff=arr[i]-min;
				if(mindiff>=maxdif)
				{
					maxdif=mindiff;
				}
			}
		}
		System.out.println(maxdif);

	}

}
