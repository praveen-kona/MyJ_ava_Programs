package DSA;
import java.util.*;
public class RightRotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,3,4,5};
		int k=7;
		k=k%arr.length;
		System.out.println(k);
		int last=arr[arr.length-1];
		int last2=arr[arr.length-2];
		for(int i=arr.length-1;i>0;i--)
		{
			arr[i]=arr[i-1];
		}
		arr[0]=last;
		arr[1]=last2;
		System.out.println(Arrays.toString(arr));

	}

}
