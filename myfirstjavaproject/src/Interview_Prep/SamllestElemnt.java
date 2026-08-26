package Interview_Prep;

public class SamllestElemnt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,3};
		int min=arr[0];
		for(int a:arr)
		{
			if(a<min)
			{
				min=a;
			}
		}
		
			System.out.println(min);

	}

}
