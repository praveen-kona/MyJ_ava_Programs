package Strings;

public class MutableVsImmutable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="hi";
		String s2="hi";
		String s3=new String("hello");

		System.out.println(s==s2);
		StringBuffer sb1=new StringBuffer("hello");
		StringBuffer sb2=new StringBuffer("hello");
		System.out.println(s3.equals(sb2));
		System.out.println(sb1.compareTo(sb2));
		sb1.append("java");
		sb1.reverse();
		System.out.println(sb1);
		

	}

}
