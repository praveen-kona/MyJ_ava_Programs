package Files;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadingUsingFileReader {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File f=new File("./student.txt");
		FileReader fr=new FileReader(f);
		int i=fr.read();
		String s="";
		while(i!=-1)
		{
			System.out.print((char)i);
			s+=String.valueOf((char)i);
			i=fr.read();
			
		}
		fr.close();
		System.out.println();
		System.out.println(s);

	}

}
