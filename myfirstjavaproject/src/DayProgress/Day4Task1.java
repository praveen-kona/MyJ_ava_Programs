package DayProgress;

public class Day4Task1 {

	public static void main(String[] args) {
		final int days_in_week=7;
		final int hours_in_day=24;
		// days_in_week=90; ->The final local variable days_in_week cannot be assigned. It must be blank and not using a compound assignment
		System.out.println("Days in Week :"+days_in_week);
		System.out.println("Hours in day :"+hours_in_day);
		final int totla_hours_in_week=days_in_week*hours_in_day;
		System.out.println("Total hours in a week :"+totla_hours_in_week);
		final int num=20;
		calcualte(num);
		
		

	}
	static void calcualte(final int num)
	{
		//num=20;
		System.out.println("Number :"+num);
		
	}

}

