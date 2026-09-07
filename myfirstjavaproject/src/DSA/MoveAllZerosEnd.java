package DSA;

public class MoveAllZerosEnd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {0,1,3,4,0,5};
		int nz=0;
		int z=0;
		while(nz<arr.length)
		{
			if(arr[nz]!=0)
			{
				int temp=arr[nz];
				arr[nz]=arr[z];
				arr[z]=temp;
				z++;
				nz++;
				
			}
			else
			{
				nz++;
			}
		}
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i] +  " ");
		}

	}

}
