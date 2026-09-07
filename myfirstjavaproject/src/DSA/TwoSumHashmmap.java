package DSA;
import java.util.*;


public class TwoSumHashmmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {2,8,7,6,5};
		int target=9;
		HashMap<Integer,Integer> map=new HashMap<>();
		for(int i=0;i<arr.length;i++)
		{
			int need=target-arr[i];
			if(map.containsKey(need))
			{
			System.out.println("["+map.get(need)+", "+i+"]");
				return;
			}
			else
			{
				map.put(arr[i],i);
			}
		}
		

	}

}
