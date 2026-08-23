package DayProgress;

public class Day3Task5 {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte b=10;
		System.out.println("Byte Value:"+b);
		System.out.println(((Object)b).getClass().getSimpleName());
		short s=10;
		System.out.println("Short Value :"+s);
		int i=10;
		System.out.println("Integre value :"+i);
		// conversion
		short s1=b;
		System.out.println("Byte to Short :"+s1);
		int i1=s1;
		System.out.println("Short to Int :"+i1);
		
		
		int num=101;
		byte res=(byte)num;
		System.out.println("Byte to int :"+res);
		

	}

}
