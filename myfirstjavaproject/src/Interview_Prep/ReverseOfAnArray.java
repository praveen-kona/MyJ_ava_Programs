package Interview_Prep;
import java.util.Arrays;
public class ReverseOfAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*int[] arr= {5,4,3,2,1};
		for(int i=arr.length-1;i>=0;i--)
		{
			System.out.print(arr[i]+" ");
		}*/
		
		int[] arr= {5,2,1,3,4};
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
