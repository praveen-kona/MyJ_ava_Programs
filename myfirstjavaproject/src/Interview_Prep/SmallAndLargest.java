package Interview_Prep;

public class SmallAndLargest {

	public static void main(String[] args) {
		int[] arr= {7,3,2,1};
		int max=arr[0];
		int min=arr[0];
		for(int a:arr)
		{
			if(a>max)
			{
				max=a;
			}
			if(a<min)
			{
				min=a;
			}
		}
		System.out.println(max);
		System.out.println(min);;

	}

}
