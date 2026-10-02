package Files;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteusingFileOutputStream {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File f=new File("./student.txt");
		FileOutputStream fos=new FileOutputStream(f);
		//if u enat string
		String s="hello";
		char[] ch=s.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			fos.write(ch[i]);
		}
		fos.write('\n');
		//only char values given
		fos.write('j');//dir chaer
		fos.write('\n');
		//internallu convert ascci
		fos.write('h');
		fos.close();
	}

}
