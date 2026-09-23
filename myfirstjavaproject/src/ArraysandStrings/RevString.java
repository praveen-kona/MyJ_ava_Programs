package ArraysandStrings;

public class RevString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="java is very easy";
		String[] str=s.split(" ");
		String rev="";
		for(int i=str.length-1;i>=0;i--)
		{
			rev+=str[i]+" ";
		}
		System.out.println(rev.trim());

	}

}
