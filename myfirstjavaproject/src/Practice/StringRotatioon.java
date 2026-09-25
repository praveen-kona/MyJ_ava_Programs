package Practice;

public class StringRotatioon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="abcd";
		String s2="cdab";
		
		if(s1.length()==s2.length())
		{
			boolean s=(s1+s1).contains(s2);
		if(s)
		{
			System.out.println(s);
		}
		else
		{
			System.out.println(s);
		}
		}
		else
		{
			System.out.println("length not equal");
		}
	}

}
