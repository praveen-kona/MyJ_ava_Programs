package TCS;

public class SecondLargestElementinarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {10,5,10};
		int max=Integer.MIN_VALUE;
		int sec_max=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>max)
			{
				sec_max=max;
				max=arr[i];
			}
			else
				if(arr[i]>sec_max&& arr[i]!=max)
				{
					sec_max=arr[i];
				}
		}
		if(sec_max==Integer.MIN_VALUE)
		{
			System.out.println("not found");
		}
		else
		{
			System.out.println(sec_max);
		}

	}

}
