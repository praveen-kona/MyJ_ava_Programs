package Practice;

public class RevWordsInString {

	public static void main(String[] args) {
		String s="hello java";
		String[] str=s.split(" "); 
		String rev="";
		for(int i=0;i<str.length;i++)
		{
			String res="";
			for(int j=str[i].length()-1;j>=0;j--)
			{
				res=res+str[i].charAt(j);
			}
			rev=rev+res+" ";
		}

		System.out.println(rev.strip());
	}

}
