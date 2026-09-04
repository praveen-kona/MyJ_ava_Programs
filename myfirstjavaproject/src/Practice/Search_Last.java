package Practice;

import java.util.Scanner;

public class Search_Last {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of elemnts : ");
		int size=sc.nextInt();
		
		int[] arr=new int[size];
		System.out.println("Enter "+size+" elements");
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		int search=20;
		int max=arr[0];
		int min=arr[0];
		int max_index=0;
		int min_index=0;
		int search_index=-1;
		for(int i=size-1;i>=0;i--)
		{
			
			if(arr[i]>max)
			{
				max=arr[i];
				max_index=i;
			}
			if(arr[i]<min)
			{
				min=arr[i];
				min_index=i;
			}
			if(arr[i]==search &&search_index==-1)
			{
				search_index=i;
				
			}
		}
		System.out.println(min+" is min elemnt at index "+min_index);
		System.out.println(max+" is max elemnt at index "+max_index);
		System.out.println(search+" found at index "+search_index);
	}

}
