package DSA;

public class Array_Avg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {10, -5,7,11,-20,10};
		int total=0; 
		for(int i=0;i<arr.length;i++)
		{
			total+=arr[i];
		}
		System.out.println("Average is "+total/(double)arr.length);

	}

}
