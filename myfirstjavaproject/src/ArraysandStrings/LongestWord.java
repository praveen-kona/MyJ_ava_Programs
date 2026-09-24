package ArraysandStrings;

public class LongestWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Java is very powerful";
		String[] l=s.split(" ");
		int max=0;
		String max_word="";
		for(int i=0;i<l.length;i++)
		{
			int count=0;
			count=l[i].length();
			if(count>max)
			{
				max=count;
				max_word=l[i];
			}
		}
		System.out.println(max_word);

	}

}
