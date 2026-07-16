package DailyPractice;
import java.util.Scanner;

public class DailyPractice4_1 {
	 static double areaofRectangle(double l,double b)
	{
		double area=l*b;
		return area;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter length of the rectangle: ");
		double l1=sc.nextInt();
		System.out.println("enter breadth of the rectangle: ");
		double b1=sc.nextInt();
		double area=areaofRectangle(l1,b1);
		System.out.println("area of rectangle is "+area);

	}

}
