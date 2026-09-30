package TCS;

import java.util.Arrays;

public class MovenegPosSIde {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1, -2, 3, -4, 5, -6};
		int pos=0;
		int neg=0;
		while(pos<arr.length)
		{
			if(arr[pos]<0)
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
