package ArraysandStrings;

public class ReveEachWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="hello java how";
		String[] str=s.split(" ");
		String rev="";
		for(int i=0;i<str.length;i++)
		{
			String res="";
			for(int j=str[i].length()-1;j>=0;j--)
			{
				res+=str[i].charAt(j);		
				}
			rev+=res+" ";
		}
		System.out.println(rev.trim());
		

	}

}
