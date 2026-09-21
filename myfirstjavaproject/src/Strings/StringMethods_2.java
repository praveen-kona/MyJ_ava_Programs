package Strings;

public class StringMethods_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="helloh";
		String s2="  he  ";
		System.out.println(s1.contains("he"));
		System.out.println(s1.contains(s2));
		System.out.println(s1.concat(" ji"));
		System.out.println(s1.startsWith("li"));
		System.out.println(s1.endsWith("llo"));
		System.out.println(s2.trim().strip());
		System.out.println(s2.strip());
		System.out.println(s1.isBlank());
		System.out.println(s1.isEmpty());
		
		String s3="hello1 hi java";
		char[] ch=s3.toCharArray();
		System.out.println(ch[6]);
		
		String s4="hello hi java";
		String[] str=s4.split(" ");
		System.out.println(str[0]);
		
		System.out.println(s1.lastIndexOf("h"));
		System.out.println(s1.indexOf("h"));
		System.out.println(s1.charAt(1));
		
		String text="pass.png";
		int dot=text.lastIndexOf(".");
		System.out.println(text.substring(dot+1,text.length()));
		
		System.out.println(text.replaceAll(text,"hello Java"));
		
		System.out.println(text.replace("p","ji"));
		
		String cmp1="apple";
		String cmp2="application";
		System.out.println(cmp1.compareTo(cmp2));
		
		String ss="hello";
		String ss2="hello";
		System.out.println(ss2.hashCode());
		System.out.println(ss.hashCode());
		ss=ss+"hi";
		System.out.println(ss.hashCode());

	}

}
