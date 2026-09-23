package ArraysandStrings;

public class CountEvenOrOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {10, 15, 20, 25, 30, 35};
		int even_count=0;
		int odd_count=0;
		for(int i=0;i<arr.length;i++)

		{
			if(arr[i]%2==0)
			{
				even_count++;
			}
			else
			{
				odd_count++;
			}
		}
		System.out.println("Even = "+even_count);
		System.out.println("Odd = "+odd_count);
	}

}
