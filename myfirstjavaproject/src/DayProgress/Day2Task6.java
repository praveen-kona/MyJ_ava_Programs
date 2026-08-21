package DayProgress;

import java.util.Scanner;

public class Day2Task6 {

	static String largestofTwo(int num,int num2,int num3)
	{
		String res=(num==num2 && num2==num3)?
				("All three are Equal")
				:((num>num2)?
						((num>num3)?num+" is big": num3+" is big"):
							(num2>num3)?num2+" is Big":num3+" is big");
		return res;			
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter first number :");
		int num=sc.nextInt();
		System.out.println("enter Second number :");
		int num2=sc.nextInt();
		System.out.println("enter Third number :");
		int num3=sc.nextInt();
		System.out.println(largestofTwo(num,num2,num3));
	}

}
