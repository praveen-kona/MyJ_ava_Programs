package DayProgress;

public class Day4Task5 {
	static final int days_in_week=7;
	final static int hours_in_days=24;
	

	
	
	public static void main(String[] args) {
		System.out.println("Total hours in week :"+(Day4Task5.days_in_week*hours_in_days));
		try
		{
			System.out.println("hi this is try block :");
		}
		catch(Exception e)
		{
			System.out.println("cant divide by 0 :");
		}
		finally
		{
			System.out.println("this block  handles expetions to clean up code whether it is exception occurs or not");
			
		}
		System.out.println("finlize() this method removed for m modern java :");
		{
			System.out.println("hello");
		}
		
		
	}

}
