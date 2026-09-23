package ArraysandStrings;

public class CountUpperLowerLetters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="HelloJAVA";
		int upper_count=0;
		int lower_count=0;
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(Character.isUpperCase(ch))
			{
				upper_count++;
			}
			else if(Character.isLowerCase(ch))
			{
				lower_count++;
			}
		}
		System.out.println("upper count : "+upper_count);
		System.out.println("Lower_Count :"+lower_count);

	}

}
