package TCS;

public class FirstRepeatArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,4,5};
		boolean isfound=false;
		for(int i=0;i<arr.length;i++)
		{
			
			int count=0;
			for(int j=0;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					count++;
				}
			}
			if(count>1)
			{
				System.out.println(arr[i]);
				isfound=true;
				break;
			}
		}
		if(!isfound)
		{
			System.out.println("not found");
		}

	}

}
