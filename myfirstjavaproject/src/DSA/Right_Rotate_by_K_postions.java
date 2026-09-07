package DSA;

import java.util.Arrays;

public class Right_Rotate_by_K_postions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,3,4,5};
		int k=8;
		k=k%arr.length;
		System.out.println(k);
		for(int j=0;j<k;j++)
		{
			int right=arr[arr.length-1];
			for(int i=arr.length-1;i>0;i--)
			{
				arr[i]=arr[i-1];
			}
			arr[0]=right;
		}
		System.out.println(Arrays.toString(arr));

	}

}
