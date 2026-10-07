package Practice;

public class COuntNo_Of_Words {

	public static void main(String[] args) {

		String s = "Java is very easy";
		String[] str=s.split(" ");
		int count=0;
		for(int i=0;i<str.length;i++)
		{
			count++;
		}

		System.out.println(count);
		//or
		System.out.println(str.length);
	}

}
