package DayProgress;
import java.util.Scanner;
class Day2Task4 {
	static void examEligibility(double percentage,boolean isHallTicket)
	{
		if(percentage>=75)
			if(isHallTicket)
				System.out.println("Eligible to write the exam");
			else
				System.out.println("hall Ticket required !");
		else
			System.out.println("Not eligible due to low attendance");
			
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter attendance percentage:");
		double percentage=sc.nextDouble();
		System.out.println("Do you have a hall ticket? (true/false):");
		boolean isHallTicket=sc.nextBoolean();
		examEligibility(percentage,isHallTicket);
		
		

	}

}
