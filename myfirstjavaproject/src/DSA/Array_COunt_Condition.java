package DSA;

public class Array_COunt_Condition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr= {10,20,10,30,40,10};
		int count=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>20)
			{
				count++;
				System.out.println(arr[i]);
			}
		}
		System.out.println("total "+count);
	}

}
