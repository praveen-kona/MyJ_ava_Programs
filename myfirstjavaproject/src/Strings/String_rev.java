package Strings;

public class String_rev {

	public static void main(String[] args) {
		// TODO Auto-generated method stub\
		String orig="Java";
		String rev="";
		for(int i=orig.length()-1;i>=0;i--)
		{
			rev+=orig.charAt(i);
		}
		System.out.println(rev);

	}

}
