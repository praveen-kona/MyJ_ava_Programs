package DSA;

public class LinearSearch_2 {
	public static void main(String[] args)
	{
		int[] arr= {10,30,10,40,50,20};
		int target=10;
		for(int i=arr.length-1;i>=0;i--)
		{
			if(arr[i]==target)
			{
				System.out.println(arr[i]);
				break;
			}
		}
	}

}
