package Practice;
import java.util.*;
public class AnnagramStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="listen";
		String s2="litsen";
		if(s1.length()!=s2.length())
		{
			System.out.println("not an anagram");
			return;
		}
		else
		{
			char[] ch=s1.toCharArray();
			Arrays.sort(ch);
			System.out.println(Arrays.toString(ch));
			
			char[] ch1=s2.toCharArray();
			Arrays.sort(ch1);
			System.out.println(Arrays.toString(ch1));
			for(int i=0;i<ch1.length;i++)
			{
				if(ch[i]!=ch1[i])
				{
					System.out.println("not anagram");
					return ;
				}
				else
				{
					System.out.println("yes");
					break;
				}
			}
			
		}
		

	}

}
