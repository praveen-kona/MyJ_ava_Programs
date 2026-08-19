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
		
		
		for(int i=s.length()-1;i>=0;i--)
		{
			System.out.print(s.charAt(i)+" ");
		}
		
		
		System.out.println();
		
		StringBuilder sb=new StringBuilder();
		for(int i=s.length()-1;i>=0;i--)
		{
			sb.append(s.charAt(i));
		}
		System.out.println(sb);
		String s3=sb.toString();
		System.out.print(s3);
		
	}

}
