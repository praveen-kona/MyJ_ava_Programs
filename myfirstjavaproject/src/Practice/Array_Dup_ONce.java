package Practice;
import java.util.*;
public class Array_Dup_ONce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[] arr = {10, 20, 30, 20, 40, 10, 20};
		 int[] dup=new int[arr.length];
		 int d=0;
		 for(int i=0;i<arr.length;i++)
		 {
			 boolean isfound=false;
			 for(int k=0;k<d;k++)
			 {
				 if(arr[i]==dup[k])
				 {
					 isfound=true;
					 break;
				 }
			 }
			 if(isfound)
				 continue;
			 for(int j=i+1;j<arr.length;j++)
			 {
				 if(arr[i]==arr[j])
				 {
					 dup[d]=arr[i];
					 d++;
					 break;
				 }
			 }
		 }
		 System.out.println(Arrays.toString(Arrays.copyOf(dup, d)));

	}

}
