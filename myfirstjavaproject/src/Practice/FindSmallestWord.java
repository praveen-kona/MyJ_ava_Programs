package Practice;

public class FindSmallestWord {

	public static void main(String[] args) {
		
		String s = "Java is very powerful";
		String[] str=s.split(" ");
		int count=Integer.MAX_VALUE;
		String min_word="";
		for(int i=0;i<str.length;i++)
		{
			if(str[i].length()<count)
			{
				count=str[i].length();
				min_word=str[i];
			}
		}
		System.out.println(min_word);

	}

}
