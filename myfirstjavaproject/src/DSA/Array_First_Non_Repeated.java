package DSA;

public class Array_First_Non_Repeated {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {5, 10, 5, 20, 10, 30};
		for(int i=0;i<arr.length;i++)
		{
			boolean isfound=false;
			for(int k=0;k<i;k++)
			{
				if(arr[i]==arr[k])
				{
					isfound=true;
					break;
				}
			}
			if(isfound)
				continue;
			
			int count=0;
			for(int j=0;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					count++;
				}
			}
			if(count==1){
				System.out.println(arr[i]);
				break;
			}
			
		}

	}

}
