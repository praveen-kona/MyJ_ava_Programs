package Practice;

public class Removeduponceprint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1, 2, 3, 2, 4, 1};
		int[] uniq=new int[arr.length];
		int u=0;
		for(int i=0;i<arr.length;i++)
		{
			boolean isfound=false;
			for(int k=0;k<u;k++)
			{
				if(arr[i]==uniq[k])
				{
					isfound=true;
					break;
				}
			}
			if(isfound)
				continue;
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					uniq[u]=arr[i];
					u++;
					break;
				}
			}
		}
		for(int i=0;i<u;i++)
		{
			System.out.print(uniq[i]+" ");
		}

	}

}
