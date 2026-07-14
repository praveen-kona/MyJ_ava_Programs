package Arrays;
import java.util.Scanner;

public class Sumofarray 
{
	public int arraysum()
	{
	
		Scanner sc=new Scanner(System.in);
		int[] arr=new int[5];
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
	      	sum+=arr[i];
	    }
		return sum;
	}

	public static void main(String[] args) 
	{	
		Sumofarray s1=new Sumofarray();
		System.out.println(s1.arraysum());
		
	}

}
