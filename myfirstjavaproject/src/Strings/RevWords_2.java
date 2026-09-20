package Strings;

public class RevWords_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="This is a test String!!";
		String[] str=s.split(" ");
		String rev="";
		for(int i=0;i<str.length;i++)
		{
			if(i%2!=0)
			{
				String res="";
				for(int j=str[i].length()-1;j>=0;j--)
				{
					res+=str[i].charAt(j);
				}
				rev+=res+" ";
			}
			else
			{
				rev+=str[i].toUpperCase()+" ";
			}
		}
		
		System.out.println(rev);

	}

}
