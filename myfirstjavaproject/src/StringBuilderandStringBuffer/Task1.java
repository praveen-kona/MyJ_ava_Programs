package StringBuilderandStringBuffer;

public class Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder sb1=new StringBuilder("hello");
		System.out.println(sb1);
		StringBuilder sb2=new StringBuilder("hello");
		System.out.println(sb1.equals(sb2));
		System.out.println(sb1.compareTo(sb2));
		System.out.println(sb1.append("hi"));
		System.out.println(sb1);
		System.out.println(sb2.delete(0, 3));
		System.out.println(sb2.deleteCharAt(0));
		System.out.println(sb2.insert(0,"ji"));
		System.out.println(sb2.charAt(1));
		System.out.println(sb2.reverse());
		System.out.println(sb2.hashCode());
		System.out.println(sb1.hashCode());
		

	}

}
