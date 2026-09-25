package ArraysandStrings;

import java.util.Arrays;

public class RearrangeArray2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[] arr = {1, 2, 3, -4, 0};

		 int[] res=new int[arr.length];
		 int pos=0;
		 int neg=0;
		 int index=0;
		 int[] positive=new int[arr.length];
		 int[] negative=new int[arr.length];
		 int n=0;
		 int p=0;
		 for(int i=0;i<arr.length;i++)
		 {
			 if(arr[i]>=0)
			 {
				 positive[p++]=arr[i];
			 }
			 else
			 {
				 negative[n++]=arr[i];
			 }
		 }
		 while(pos<p && neg <n)
		 {
			 res[index++]=positive[pos++];
			 res[index++]=negative[neg++];
		 }
		 while(pos<p)
		 {
			 res[index++]=positive[pos++];
		 }
		 while(neg<n)
		 {
			 res[index++]=negative[neg++];
		 }

		 System.out.println(Arrays.toString(res));
	}

}
