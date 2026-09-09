package Strings;

public class VowelConsonant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="hello";
		char[] ch=s.toCharArray();
		for(int i=0;i<s.length()-1;i++)
		{
			if(ch[i]=='a'||ch[i]=='e'||ch[i]=='o'||ch[i]=='u'||ch[i]=='i')
			{
				char temp=ch[i];
				ch[i]=ch[i+1];
				ch[i+1]=temp;
				i++;
			}
		}
		System.out.println(new String(ch));

	}

}
