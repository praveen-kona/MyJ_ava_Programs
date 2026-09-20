package Strings;

public class CountNoCharinString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="java is super";
		int count=0;
		System.out.println(s.trim().length());
		for(int i=0;i<s.length();i++)
		{
			count++;
		}
		System.out.println(count);

	}

}
