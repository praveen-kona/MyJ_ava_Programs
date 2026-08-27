package Interview_Prep;
import java.util.Scanner;
public class SmallestElementArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Array size :");
		int size=sc.nextInt();
		int[] arr=new int[size];
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		int min=Integer.MAX_VALUE;
		int second_min=Integer.MAX_VALUE;
		for(int a:arr)
		{
			if(a<min)
			{
				second_min=min;
				min=a;
			}
			else if(a<second_min && a!=min)
			{
				second_min=a;
			}
		}
		System.out.println(second_min);
	}

}
