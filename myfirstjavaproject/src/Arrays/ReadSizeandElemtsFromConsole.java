package Arrays;
import java.util.Arrays;
import java.util.Scanner;

public class ReadSizeandElemtsFromConsole {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter Size of an aray: ");
		int size=sc.nextInt();
		int[] arr=new int[size];
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		// print like array string;
		System.out.println(Arrays.toString(arr));
		//print using loop
		
		for(int i=0;i<size;i++)
		{
			System.out.println(arr[i]);
		}
		
		
		

	}

}
