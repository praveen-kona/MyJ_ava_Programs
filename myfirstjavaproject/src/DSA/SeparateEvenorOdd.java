package DSA;
import java.util.*;
public class SeparateEvenorOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {2,4,5,8,1,3};
		int even=0;
		int odd=0;
		while(even<arr.length)
		{
			if(arr[even]%2==0)
			{
				int temp=arr[even];
				arr[even]=arr[odd];
				arr[odd]=temp;
				even++;
				odd++;
			}
			else
			{
				even++;
			}
		}
		System.out.println(Arrays.toString(arr));

	}

}
