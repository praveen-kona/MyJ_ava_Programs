package StringBuilderandStringBuffer;

public class SbMethods_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StringBuilder sb1=new StringBuilder("hello");
		System.out.println(sb1.append("hi"));
		System.out.println(sb1.delete(0, 3));
		System.out.println(sb1.deleteCharAt(3));
		System.out.println(sb1.replace(0, 3, "parag"));
		System.out.println(sb1);
		System.out.println(sb1.reverse());
	}

}
