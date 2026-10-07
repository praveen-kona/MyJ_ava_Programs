package Practice;

public class FindLargestWord {

	public static void main(String[] args) {
		String s = "Java programming is powerful";
		String[] str=s.split(" ");
		int count=Integer.MIN_VALUE;
	    String max_word="";
		for(int i=0;i<str.length;i++)
		{
			if(str[i].length()>count)
			{
				count=str[i].length();
				max_word=str[i];
			}
		}
		System.out.println(max_word);

	}

}
