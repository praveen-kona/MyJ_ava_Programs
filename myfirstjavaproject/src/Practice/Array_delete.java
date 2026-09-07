package Practice;
import java.util.*;
public class Array_delete {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {10, 20, 30, 40, 50};
		int index = 2;
		for(int i=index;i<arr.length-1;i++)
		{
			arr[i]=arr[i+1];
		}
		arr[arr.length-1]=0;
		System.out.println(Arrays.toString(arr));
	}

}
