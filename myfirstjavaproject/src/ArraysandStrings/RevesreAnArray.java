package ArraysandStrings;

import java.util.Arrays;

public class RevesreAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {10, 20, 30, 40, 50};
		int left=0;
		int right=arr.length-1;
		while(left<right)
		{
			int temp=arr[left];
			arr[left]=arr[right];
			arr[right]=temp;
			left++;
			right--;
		}
		System.out.println(Arrays.toString(arr));

	}

}
