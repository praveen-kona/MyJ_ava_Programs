package Practice;

public class Frequcny {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {2, 2, 1, 1, 1, 2, 2};
		int freq=0;
		for(int i=0;i<arr.length;i++)
		{boolean isfound=false;
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
			System.out.println(+arr[i]+"->"+count);
			if(count>arr.length/2)
			{
				freq=arr[i];
			}
		}

		System.out.println(freq);
	}

}
