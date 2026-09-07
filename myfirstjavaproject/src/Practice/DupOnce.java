package Practice;
import java.util.*;
public class DupOnce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1, 2, 2, 3, 1, 4, 3};

		int[] uniq=new int[arr.length];
		int u=0;
		for(int i=0;i<arr.length;i++)
		{
			boolean isfound=false;
			for(int k=0;k<u;k++)
			{
				if(arr[i]==uniq[k])
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
					uniq[u]=arr[i];
					u++;
					break;
				}
			}
		}
		System.out.println(Arrays.toString(Arrays.copyOf(uniq,u)));
	}

}
