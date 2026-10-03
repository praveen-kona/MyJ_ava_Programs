package Practice;

public class StringFrequency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="programming";
		int[] count=new int[256];
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			int x=ch;
			count[x]++;
		}
		for(int i=0;i<s.length();i++)
		{
			if(count[s.charAt(i)]!=0)
			{
				System.out.println(s.charAt(i)+" "+count[s.charAt(i)]);
				count[s.charAt(i)]=0;
			}
		}

	}

}
