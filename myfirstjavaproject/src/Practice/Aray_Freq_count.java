package Practice;

public class Aray_Freq_count {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {10,20,30,10,20};
		for(int i=0;i<arr.length;i++)
		{
			boolean isCOunterd=false;
			for(int k=0;k<i;k++)
			{
				if(arr[i]==arr[k])
				{
					isCOunterd=true;
					break;
				}
			}
			if(isCOunterd)
				continue;
			int count=0;
			for(int j=0;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					count++;
				}
			}
			System.out.println(arr[i]+"-> "+count);
			if(count==1)
			{
				System.out.println(arr[i]);
			}
		}

	}

}
