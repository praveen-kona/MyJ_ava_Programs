package Practice;

public class MoveZerostoned {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {0, 0, 20, 0, 30};
		int nz=0;
		int z=0;
		while(nz<arr.length)
		{
			if(arr[nz]==0)
			{
				int temp=arr[nz];
				arr[nz]=arr[z];
				arr[z]=temp;
				nz++;
				z++;
			}
			else
			{
				nz++;
			}
		}
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}

	}

}
