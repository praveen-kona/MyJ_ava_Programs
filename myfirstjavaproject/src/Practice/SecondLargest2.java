package Practice;

public class SecondLargest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {10, 5, 20, 8, 20, 15};
		int max=Integer.MIN_VALUE;
		int second_max=Integer.MIN_VALUE;
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
