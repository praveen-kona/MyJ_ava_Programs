package Practice;

public class ChangeEvenPostoOddWords {

	public static void main(String[] args) {
		String s="hello java";
		String[] str=s.split(" "); 
		String rev="";
		for(int i=0;i<str.length;i++)
		{
			if(i%2==0)
			{
				String res="";
				for(int j=str[i].length()-1;j>=0;j--)
				{
					res=res+str[i].charAt(j);
				}
				rev=rev+res+" ";
			}
			else
			{
				rev=rev+str[i].toUpperCase()+" ";
			}
			
		}

		System.out.println(rev.strip());

	}

}
