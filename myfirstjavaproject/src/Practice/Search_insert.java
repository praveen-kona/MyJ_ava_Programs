package Practice;
import java.util.*;
public class Search_insert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of elemnts : ");
		int size=sc.nextInt();
		int capacity=size+2;
		
		int[] arr=new int[capacity];
		System.out.println("Enter "+size+" elements");
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		int position=-1;
		int search=30;
		int value=25;
		for(int i=0;i<size;i++)
		{
			if(arr[i]==search)
			{
				position=i;
				break;
			}
		}
		if(position!=-1)
		{
			for(int i=size;i>position;i--)
			{
				arr[i]=arr[i-1];
				
			}
			arr[position]=value;
			size++;
			System.out.println(Arrays.toString(Arrays.copyOf(arr, size)));
		}
	

	}

}
