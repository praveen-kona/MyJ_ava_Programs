package Practice;

public class COuntVowelsAndConsonants {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "ProgrAmming";
		
		int count=0;
		int cons_count=0;
		for(int i=0;i<s.length();i++)
		{
			char ch=Character.toLowerCase(s.charAt(i));
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
			{
				count++;
			}
			else
			{
				cons_count++;
			}
		}
		System.out.println(cons_count);
		System.out.println(count);
	}

}
