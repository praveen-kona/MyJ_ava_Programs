package DayProgress;

public class Day4Task2 {

	public static void main(String[] args) {
		
		 StringBuilder sb=new StringBuilder("hello");
		sb.append(" java");
		// sb=new StringBuilder("world");  cannot reassign;
		//  	sb=new StringBuilder("world");
		System.out.println(sb);
		String str=sb.toString();
		for(int i=0;i<str.length();i++)
		{
			System.out.println(str.charAt(i));
		}

	}

}
