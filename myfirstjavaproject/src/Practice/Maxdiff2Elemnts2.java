package Practice;

public class Maxdiff2Elemnts2 {

	public static void main(String[] args) {
		int[] arr= {7,1,5,3,6,4};
		int maxdiff=0;
		int minnum=arr[0];
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i]<=minnum)
			{
				minnum=arr[i];
			}
			else
			{
				int mindiff=arr[i]-minnum;
				if(mindiff>maxdiff)
				{
					maxdiff=mindiff;
				}
			
			}
		}
		System.out.println(maxdiff);

	}

}
