package Strings;

public class StringWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Hello howjhg are u Mom";
		String[] str=s.split(" ");
		int count=0;
		int max_word_index=-1;
		String max="";
		for(int i=0;i<str.length;i++)
		{
			if(str[i].length()>count)
			{
				count=str[i].length();
				max_word_index=i;
				max=str[i];
				
			}
		}
		System.out.println("max length word is : "+max+" with count "+count+" at index "+max_word_index);

	}

}
