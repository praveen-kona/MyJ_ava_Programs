package Interview_Prep;
import java.util.Scanner;
public class SmallestWithoutSortArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of anarry :");
		int size=sc.nextInt();
		int[] arr=new int[size];
		
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		int min=arr[0];
		for(int i=0;i<size;i++)
		{
			if(arr[i]<min)
			{
				min=arr[i];
			}
		}
		System.out.println("Min value is :"+min);
		
		

	}

}
