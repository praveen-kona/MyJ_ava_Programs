package Interview_Prep;
import java.util.Arrays;
public class ReverseAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {3,2,1,4};
		for(int start=0,
				end=arr.length-1;start<end;start++,end--)
		{
			int temp=arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
			
			
		}
		System.out.println(Arrays.toString(arr));
		

	}

}
