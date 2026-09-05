package DSA;

public class Array_Frequency_Count_one_elemnt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {10, 20, 10, 30, 20, 10};
		int count=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==10)
			{
				count++;
			}
		}
		System.out.println("10 occurs  "+count+" times");

	}

}
