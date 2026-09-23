package ArraysandStrings;

public class FindArrayAverage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {10, 20, 30, 40, 50};
		double avg=0.0;
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			sum+=arr[i];
		}
		avg=(double)(sum/arr.length);
		System.out.println("Average of array is : "+avg);

	}

}
