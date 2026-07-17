package InterviewQustions.com;

public class ReverseoftheNumber {

	public static void main(String[] args) {
		int num=123;
		int rev=0;
		while(num>0)
		{
			rev=rev*10 +num%10;
			num=num/10;
		}
		System.out.println("revrse of the number is:"+rev);
		int n=4321;
		String s=Integer.toString(n);
		String s1="";
		for(int i=s.length()-1;i>=0;i--)
		{
			s1=s1+s.charAt(i);
		}
		System.out.println(s1);
		
		
		StringBuilder sb=new StringBuilder();
		for(int i=s.length()-1;i>=0;i--)
		{
			sb.append(s.charAt(i));
		}
		String s3=sb.toString();
		System.out.println(s3);
		
	}

}
