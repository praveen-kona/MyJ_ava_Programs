package Eceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Checked_Exception_2 {

	public static void main(String[] args) throws FileNotFoundException,IOException, InterruptedException{
		// TODO Auto-generated method stub
		File f=new File("C:\\Users\\hi\\OneDrive\\Desktop\\Demo\\file.txt");
		
		FileReader fr=new FileReader(f);
		try {
			
			int i=fr.read();
			while(i!=-1)
			{
				System.out.print((char)i);
				Thread.sleep(100);
				i=fr.read();
			}
		} catch (FileNotFoundException e) {
		
			e.printStackTrace();
		}
	}

}
