package Practice;

public class StringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Programming";
		String rev="";
		for(int i=s.length()-1;i>=0;i--)
		{
			rev+=s.charAt(i);
		}
		System.out.println(rev);

	}

}
