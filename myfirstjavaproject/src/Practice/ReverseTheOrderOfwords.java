package Practice;

public class ReverseTheOrderOfwords {

	public static void main(String[] args) {
		String s = "Java is easy";
		String[] str=s.split(" ");
		String rev="";
		for(int i=str.length-1;i>=0;i--)
		{
			rev+=str[i]+" ";
		}
		System.out.println(rev.trim());
	}

}
