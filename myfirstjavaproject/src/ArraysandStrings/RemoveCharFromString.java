package ArraysandStrings;

public class RemoveCharFromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="praveen";
		String s2="";
		char ch='e';
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)!=ch)
			{
				s2+=s.charAt(i);
				
			}
		}
		System.out.println(s2);

	}

}
