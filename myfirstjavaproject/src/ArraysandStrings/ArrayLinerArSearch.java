package ArraysandStrings;

public class ArrayLinerArSearch {

	public static void main(String[] args) {
		int[] arr = {10, 25, 30, 45, 50};
		int target = 70;
		int index=-1;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==target)
			{
				System.out.println(arr[i]);
				index=i;
			}
		}
		if(index!=-1)
		{
			System.out.println("Element found at index : "+index);
		}
		else
		{
			System.out.println("not found");
		}

	}

}
