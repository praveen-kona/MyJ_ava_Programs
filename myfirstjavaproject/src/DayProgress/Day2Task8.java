package DayProgress;
import java.util.Scanner;
public class Day2Task8 {

	static String simInter(double Principal,double rate,double time)
	{
		double si=(Principal*rate*time)/100;
		return "Simple Interest :"+si;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Principal Amount :");
		double Principal=sc.nextDouble();
		System.out.println("Enter rate :");
		double rate=sc.nextDouble();
		System.out.println("Enter Time:");
		double time=sc.nextDouble();
		System.out.println(simInter(Principal,rate,time));

	}

}
