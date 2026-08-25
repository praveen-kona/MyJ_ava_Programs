package Interview_Prep;
import java.util.Scanner;
import java.util.Arrays;
public class SecondLargestWithoutSortingArray 
{
	static void second_Largest(int[] arr)
	{
		System.out.println(Arrays.toString(arr));
		int max=Integer.MIN_VALUE;
		int second_max=Integer.MAX_VALUE;
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
			System.out.println("no second largest :");
		}
		else
		{
			System.out.println(second_max+" is second Largest");
		}
	}

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of an array :");
		int size=sc.nextInt();
		int[] arr=new int[size];
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		second_Largest(arr);

	}

}
