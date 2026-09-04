package DSA;
import java.util.*;
public class Array_Del_by_Value {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr=new int[6];
		arr[0]=1;
		arr[1]=2;
		arr[2]=3;
		arr[3]=4;
		arr[4]=6;
		int size=5;
		int position=-1;
		int value=5;
		for(int i=0;i<size;i++)
		{
			if(arr[i]==value)
			{
				position=i;
				break;
				
			}
		}
		if(position!=-1)
		{
			for(int i=position;i<size-1;i++)
			{
				arr[i]=arr[i+1];
			}
			arr[size-1]=0;
			size--;
			System.out.println(Arrays.toString(Arrays.copyOf(arr,size)));
		}
		else
		{
			System.out.println(position);
		}		
		

	}

}
