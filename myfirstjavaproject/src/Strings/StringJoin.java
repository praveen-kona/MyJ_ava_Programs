package Strings;

public class StringJoin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="hello";
		String s2="hi";
		String s3="how are u";
		String s4=String.join("-",s1,s2,s3);
		System.out.println(s4);
		
		//or
		
		String ss1="hello";
		String ss2="how";
		String ss3="are";
		String ss4=String.join("$", ss1,ss2,ss3);
		System.out.println(ss4);

	}

}
