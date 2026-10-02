package Files;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class WriteUsingBufferedReader {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File f=new File("./student.txt");
		
		//FileWriter fr=new FileWriter(f);
		
		FileOutputStream fos=new FileOutputStream(f,true);
		OutputStreamWriter osw=new OutputStreamWriter(fos);
		
		
		BufferedWriter bw=new BufferedWriter(osw);
	
	String s="\njadal";
	bw.write(s);
		bw.close();

	}

}
