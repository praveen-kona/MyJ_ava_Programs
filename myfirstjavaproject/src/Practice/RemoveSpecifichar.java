package Practice;

public class RemoveSpecifichar {

	public static void main(String[] args) {

		String s = "programming";
		char target = 'm';
		String r="";
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)!=target)
			{
				r+=s.charAt(i);
			}
		}
		System.out.println(r);

	}

}
