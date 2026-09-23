package ArraysandStrings;

public class RevesrAString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="hello";
		String str="";
		for(int i=s.length()-1;i>=0;i--)
		{
			str+=s.charAt(i);
		}
		System.out.println(str);

	}

}
