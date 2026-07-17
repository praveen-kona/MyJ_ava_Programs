package InterviewQustions.com;

public class SecondLargestElementinArraywithoutSorting {

	static void array()
	{
		int[] arr= {2,2,2};
		int max= Integer.MIN_VALUE;
		int second_max= Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>max)
			{
				second_max=max;
				max=arr[i];
			}
			else if(arr[i]>second_max && arr[i]!=max)
			{
				second_max=arr[i];
			}
		}
		if(second_max==Integer.MIN_VALUE)
		{
			System.out.println("not found");
		}
		else
		{
			System.out.println(second_max);
		}
	}
	public static void main(String[] args) {
		
		array();
	}

}
