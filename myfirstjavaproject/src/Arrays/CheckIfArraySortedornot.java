package Arrays;

public class CheckIfArraySortedornot {

	static void sortOrNot(int[] arr)
	{
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i]<arr[i-1])
			{
				System.out.println("False");
				return;
				
			}
		}
		System.out.println("True");
	}
	public static void main(String[] args) {
		

		int[] arr= {1,2,3,4,5};
	sortOrNot(arr);
	}

}
