package DayProgress;
import java.util.Scanner;
public class Day2Task120 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter temperature in Celsius: ");
		double tempin_celcius=sc.nextDouble();
		//Fahrenheit = (Celsius × 9 / 5) + 32
		double fahrenheit=(tempin_celcius*9/5)+32;
		System.out.println("Fahrenheit : "+fahrenheit);
		
	}

}
