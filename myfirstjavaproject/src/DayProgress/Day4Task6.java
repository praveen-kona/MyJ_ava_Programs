package DayProgress;

public class Day4Task6 {

	public static void main(String[] args) {
		String price="500";
		String quantity ="3";
		System.out.println("Price :"+price);
		System.out.println("Quantity :"+quantity);
		int total=Integer.parseInt(price)*Integer.parseInt(quantity);
		System.out.println("Total :"+total);
		
		int num=250;
		String str=Integer.toString(num);
		System.out.println("Integer value :"+num);
		System.out.println("String value :"+str);
		System.out.println(((Object)num).getClass());
		System.out.println((Object)str.getClass());

	}

}
