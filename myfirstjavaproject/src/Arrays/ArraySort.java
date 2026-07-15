package Arrays;

public class ArraySort {

	public static void main(String[] args) {
		ArraySort a1=new ArraySort();
 a1.sort();
	}
	void sort()
	{
		int[] arr= {5,8,9,10,3};
		int temp=0;
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=0;j<arr.length-1-i;j++)
			{
				if(arr[j]>arr[j+1])
				{
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
	}

}
