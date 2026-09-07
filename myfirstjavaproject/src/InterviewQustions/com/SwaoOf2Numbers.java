package InterviewQustions.com;

public class SwaoOf2Numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		int b=20;
		a=a^b;
		b=a^b;
		a=a^b;
		System.out.println(a);
		System.out.println(b);
		int c=10;
		int d=20;
		c=(c+d)-(d=c);
		System.out.println(c);
		System.out.println(d);
		
		

	}

}
