package DayProgress;

public class Day4Task7 {

	public static void main(String[] args) {
		double price=99.50;
		String str=Double.toString(price);
		System.out.println("Price :" +str);
		System.out.println(((Object)price).getClass());
		
		
		String price1="99.50";
		double d=Double.parseDouble(price1);
		System.out.println("String value: "+price1);
		System.out.println("Double Vlaue :"+d);
		

	}

}
