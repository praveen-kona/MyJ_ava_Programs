package Practice;
import java.util.*;
public class LCS3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr={2, 7, 9, 3, 1};
		int max=0;
		for(int i=0;i<arr.length;i++)
		{int sum=0;
			for(int j=i+2;j<arr.length;j++)
			{
				if(arr[i]+arr[j]>sum)
				{
					sum=(arr[i]+arr[j]);
				}
			}
			if(sum>max)
			{
				max=sum;
			}
		}
		System.out.println(max);
		
}
}
