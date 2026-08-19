package projects;
import java.util.Scanner;
import java.util.Random;

public class RockPaperScissor {
	public static void main(String[] args)
	{
		
		System.out.println(" == ROCK PAPER SCISSOR ! ==");
		System.out.println("1. Rock");
		System.out.println("2. Paper");
		System.out.println("3.Scisors	");
		
		Scanner sc=new Scanner(System.in);
		Random rn=new Random();
		
		 System.out.println("enter user choice :");
		 int userchoice=sc.nextInt();
		 
		 if(userchoice<1 || userchoice >3)
		 {
			 System.out.println("user choose invalid choice");
			 System.out.println("so cant play");
			 System.out.println("plz enter the correct choice like 1,2,3");
		 }
		 else
		 {
			 
			 int computerchoice=rn.nextInt(3)+1;
			 
			 // display user choice 
			    if (userchoice == 1) {
	                System.out.println("User chose: Rock");
	            }
	            else if (userchoice == 2) {
	                System.out.println("User chose: Paper");
	            }
	            else {
	                System.out.println("User chose: Scissors");
	            }
			 
			    //  display computer choice
	            if (computerchoice == 1) {
	                System.out.println("Computer chose: Rock");
	            }
	            else if (computerchoice == 2) {
	                System.out.println("Computer chose: Paper");
	            }
	            else {
	                System.out.println("Computer chose: Scissors");
	            }
			 
		 // check winner 
			 if((userchoice==1 && computerchoice==3) || 
				 (userchoice==2 && computerchoice==1 ) ||
				( userchoice==3 && computerchoice==2))
			 {
				 System.out.println("User Won");
			 }
			 else if(userchoice==computerchoice)
			 {
				 System.out.println("Draw");
			 }
			 else
			 {
				 System.out.println("computer wins");
			 }
		  }
		 sc.close();
		}

}
