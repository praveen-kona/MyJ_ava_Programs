package Files;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadUsingScanner {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		File f=new File("./student.txt");
		Scanner sc=new Scanner(f);
		String s="";
		while(sc.hasNextLine())
		{
				
			System.out.println(sc.nextLine());
			s+=sc.nextLine()+"\n";
					
		}
		System.out.println(s);
		sc.close();
		

	}

}
