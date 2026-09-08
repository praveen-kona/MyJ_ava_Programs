package DSA;

public class Vowel_Consonant_String {

	public static void main(String[] args) {
		String s="hello";
		char[] ch=s.toCharArray();
		for(int i=0;i<ch.length-1;i++)
		{
			 if (ch[i] == 'a' || ch[i] == 'e' || ch[i] == 'i'
			            || ch[i] == 'o' || ch[i] == 'u') {
				 char temp=ch[i];
				 ch[i]=ch[i+1];
				 ch[i+1]=temp;
				 i++;
			 }

		}
		System.out.println(new String(ch));
	}

}
