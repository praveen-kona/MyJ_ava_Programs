package Practice;

import java.util.Arrays;

public class MovePosAndNeg {

	public static void main(String[] args) {


		int[] arr= {1,2,3,4};
		int pos=0;
		int neg=0;
		while(pos<arr.length) 
		{
			if(arr[pos]%2==0)
			{
				int temp=arr[pos];
				arr[pos]=arr[neg];
				arr[neg]=temp;
				pos++;
				neg++;
			}
			else
			{
				pos++;
			}
		}
		System.out.println(Arrays.toString(arr));
	}

}
