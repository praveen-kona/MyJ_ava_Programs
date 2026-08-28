package Interview_Prep;
import java.util.*;
public class Smallest_Element {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of an array");
		int size=sc.nextInt();
		System.out.println("Enter array elements :");
		int[] arr=new int[size];
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		int min=arr[0];
		for(int a:arr)
		{
			if(a<min)
			{
				min=a;
			}
		}
		System.out.println("Min is :"+min);

	}

}
