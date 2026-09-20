package Strings;

public class RevWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="java is super";
		String[] s1=s.split(" ");
		String res="";
		for(int i=0;i<s1.length;i++)
		{
			String rev="";
			for(int j=s1[i].length()-1;j>=0;j--)
				{
				rev=rev+s1[i].charAt(j);
				}
			res=res+rev+" ";
			}
		System.out.println(res);

	}

}
