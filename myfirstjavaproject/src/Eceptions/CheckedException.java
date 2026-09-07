package Eceptions;
import java.util.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckedException {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		
		
		// or simply handle using try catch block
		
		File file1=new File("C:files.pdf");
		try {
			FileInputStream fi1=new FileInputStream(file1);
		}
		catch(Exception e)
		{
			System.out.println(Arrays.toString(e.getStackTrace()));
		}
		File file=new File("C:files.pdf");
		FileInputStream fi=new FileInputStream(file);

		
		
		
		
		
	}

}
