package Interview_Prep;
import java.util.Arrays;
class ReverseWithoutPrintBackward {

	public static void main(String[] args) {
		int[] arr= {5,2,3,1};
		int start=0;
		int end=arr.length-1;
		while(start<end)
		{
			int temp=arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
			start++;
			end--;
		}
		System.out.println(Arrays.toString(arr));

	}

}
