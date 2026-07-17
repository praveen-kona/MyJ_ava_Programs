package Arrays;

public class MoveAllZerostoend {
	static void move()
	{
		int[] arr= {0,1};
		if(arr.length==0 || arr.length==1)
		{
			return;
		}
		int nz=0;
		int z=0;
		while(nz<arr.length)
		{
			if(arr[nz]!=0)
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
			System.out.println(arr[i]+ " ");
		}
	}

	public static void main(String[] args) {
		move();

	}

}
