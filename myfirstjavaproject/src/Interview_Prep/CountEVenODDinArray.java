package Interview_Prep;
import java.util.Scanner;
public class CountEVenODDinArray
{
	static void evenODDCount(int[] arr)
	{
		int even_count=0;
		int odd_count=0;
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2==0)
				even_count++;
			else
				odd_count++;
		}
		System.out.println("even count "+even_count);
		System.out.println("Odd count "+odd_count);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size :");
		int size=sc.nextInt();
		int[] arr=new int[size];
		System.out.println("Enter arry elements :");
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
			
		}
		evenODDCount(arr);
		

	}

}
