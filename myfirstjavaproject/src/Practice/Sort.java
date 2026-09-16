package Practice;
import java.util.*;
public class Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,0,2,0,1,2};
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length-1-i;j++)
			{
				if(arr[i]>arr[j])
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));

	}

}
