package Practice;

public class StringFrequency1 {

	public static void main(String[] args) {
		String s="ccaabb";
		int[] count=new int [256];
		for(int i=0;i<s.length();i++)
		{
			count[s.charAt(i)]++;
		}
//		for(int i=0;i<s.length();i++)
//		{
//			if(count[s.charAt(i)]!=0)
//			{
//				System.out.println(s.charAt(i)+" "+count[s.charAt(i)]);
//			}
//			count[s.charAt(i)]=0;
//		}
		for(int i=0;i<count.length;i++)
		{
			if(count[i]!=0)
			{
				System.out.println((char)(i)+" "+count[i]);
			}
		}
	}

}
