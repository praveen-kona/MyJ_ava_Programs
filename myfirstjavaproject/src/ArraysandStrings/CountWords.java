package ArraysandStrings;

public class CountWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="hello java how are you";
		int count=0;
		String[] str=s.split(" ");
		for(int i=0;i<str.length;i++)
		{
			count++;
		}

		System.out.println("No. of words in a strings is : "+count);
	}

}
