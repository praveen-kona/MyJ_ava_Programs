package Strings;

public class StringArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="hello hi how are u";
		int j=0;
		
		String[] str=s.split(" ");
		String[] even=new String[str.length];
		for(int i=0;i<str.length;i++)
		{
			if(i%2!=0)
			{
				even[j]=str[i];
				j++;
			}
		}
		for(int i=0;i<j;i++)
		{
			System.out.print(even[i]+" ");
		}

	}

}
