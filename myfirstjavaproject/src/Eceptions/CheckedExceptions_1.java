package Eceptions;

import java.io.File;
import java.io.IOException;

public class CheckedExceptions_1 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		System.out.println("Main method started");
		File f=new File("C:\\Users\\hi\\OneDrive\\Desktop\\Demo\\file1.csv");

		try {
			f.createNewFile();
			 System.out.println("File created successfully");
		} catch (IOException e) {
			
			e.printStackTrace();
			
		}
		System.out.println("main method ended");
	}

}
