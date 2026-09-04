package DSA;

public class Array_Del_Begi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr=new int[6];
		arr[0]=1;
		arr[1]=2;
		arr[2]=3;
		arr[3]=4;
		arr[4]=5;
		int size=5;
		for(int i=0;i<size-1;i++)
		{
			arr[i]=arr[i+1];
		}
		arr[size-1]=0;
		size--;
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}

	}

}
