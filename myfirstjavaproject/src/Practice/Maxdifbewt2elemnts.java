package Practice;

public class Maxdifbewt2elemnts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,3,4,5};
		int min=arr[0];
		int maxdiff=0;
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i]<=min)
			{
				min=arr[i];
			}
			else
			{
				int mindif=arr[i]-min;
				if(mindif>maxdiff)
				{
					maxdiff=mindif;
				}
			}
		}
		System.out.println(maxdiff);

	}

}
