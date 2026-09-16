package Practice;
import java.util.*;
import java.util.HashMap;

public class TwosumPairwithgivensum {
	static int[] two(int[] arr,int target)
	{
		HashMap<Integer,Integer> map=new HashMap<>();
		for(int i=0;i<arr.length;i++)
		{
			int need=target-arr[i];
			if(map.containsKey(need))
				return new int[] {map.get(need), i};
			else
				map.put(arr[i],i);
		}
		return new int[] {-1, -1};
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {2,7,11,10};
		int target=9;
		int[] res=two(arr,target);
		System.out.println(arr[res[0]]+" + "+arr[res[1]]+" = "+target);
		System.out.println(Arrays.toString(res));

	}

}
