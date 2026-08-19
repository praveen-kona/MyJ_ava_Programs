package InterviewQustions.com;
import java.util.Scanner;

public class SecondLargestElementinArraywithoutSorting {

	static void array(int[] arr)
	{
		int max= Integer.MIN_VALUE;  // for negative number also
		int second_max= Integer.MIN_VALUE; // for negative numbers also
		
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
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size:");
		int size=sc.nextInt();
		int[] arr=new int[size];
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		array(arr);
	}

}
