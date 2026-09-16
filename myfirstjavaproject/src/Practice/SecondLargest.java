package Practice;

public class SecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,3,4,5};
		int second_max=Integer.MIN_VALUE;
		int max=Integer.MIN_VALUE;
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

}
