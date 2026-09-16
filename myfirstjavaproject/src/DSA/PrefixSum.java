package DSA;
import java.util.*;
public class PrefixSum {
	static int[] prefix(int[] arr)
	{
		int[] res=new int[arr.length];
		res[0]=arr[0];
		for(int i=1;i<arr.length;i++)
		{
			res[i]=res[i-1]+arr[i];
		}
		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {2, 4, 1, 3, 5};
		int[] res=prefix(arr);
		System.out.println(Arrays.toString(res));

	}

}
