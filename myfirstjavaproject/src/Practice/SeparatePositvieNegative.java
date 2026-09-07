package Practice;
import java.util.*;
public class SeparatePositvieNegative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {-2, 5, 0, -7, 10, 0, 3};
		int pos=0;
		int neg=0;
		while(pos<arr.length)
		{
			if(arr[pos]>0)
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
