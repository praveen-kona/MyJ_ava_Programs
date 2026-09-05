package DSA;

public class LinearSearch_1 {
	static int frequency(int[] arr, int target) {
	    int count = 0;

	    for (int i = 0; i < arr.length; i++) {
	        if (arr[i] == target) {
	            count++;
	            return i;
	        }
	    }

	    return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {10, 20, 10, 30, 20, 10};
		System.out.println(frequency(arr,30));

	}

}
