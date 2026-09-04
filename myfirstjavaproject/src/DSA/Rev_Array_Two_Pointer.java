package DSA;
import java.util.*;
public class Rev_Array_Two_Pointer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {4,2,3,1};
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
