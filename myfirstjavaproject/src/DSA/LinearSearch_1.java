package DSA;

public class LinearSearch_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {10,20,40,20,60};
		int target=20;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==target)
			{
				System.out.println("Elemtnt "+arr[i]+" found at index  "+i);
				break;
			}
		}

	}

}
