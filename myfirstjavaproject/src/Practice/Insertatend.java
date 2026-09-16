package Practice;

import java.util.*;

public class Insertatend {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr=new int[10];
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size of elemnts ");
		int size=5;
	
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(int i=size;i>0;i--)
		{
			arr[i]=arr[i-1];
		}
		arr[0]=3;
		size++;
		System.out.println(Arrays.toString(arr));

	}

}
