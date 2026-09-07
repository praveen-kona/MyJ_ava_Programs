package DSA;
import java.util.*;
public class LeftRotateb_K_positons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {10,20,30,40,50};
		int k=8;
		k=k%arr.length;
		System.out.println(k);
		for(int j=0;j<k;j++)
		{
			int left=arr[0];
		for(int i=0;i<arr.length-1;i++)
		{
			arr[i]=arr[i+1];
		}
		arr[arr.length-1]=left;
		}
		System.out.println(Arrays.toString(arr));
	}

}
