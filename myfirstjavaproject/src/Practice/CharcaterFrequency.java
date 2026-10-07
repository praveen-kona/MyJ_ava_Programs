package Practice;

public class CharcaterFrequency {

	public static void main(String[] args) {

		String s = "programming";
		int count=0;
		for(int i=0;i<s.length();i++)
		{
			
			char target = 'm';
				if(s.charAt(i)==target)
				{
					count++;
				}
			
		}
		System.out.println(count);

	}

}
