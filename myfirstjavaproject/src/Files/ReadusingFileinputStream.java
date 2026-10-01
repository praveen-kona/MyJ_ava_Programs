package Files;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ReadusingFileinputStream {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File f=new File("./student.txt");
		if(!f.exists())
		{
			f.createNewFile();
			System.out.println("File created !");
		}
		else
		{
			System.out.println("already exists");
		}
			
		
		
		FileInputStream fis=new FileInputStream(f);
		
		int i=fis.read();
		String s="";
		while(i!=-1)
		{
			System.out.print((char)i);
			s=s+String.valueOf((char)i);
			i=fis.read();
			
		}
		System.out.println();
		System.out.println(s);
		fis.close();

		
	}

}
