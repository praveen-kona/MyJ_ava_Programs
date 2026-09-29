package Files;

import java.io.File;
import java.io.IOException;

public class FileMethodDelAppndGEtPth {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File f=new File("C:\\Users\\hi\\OneDrive\\Desktop\\FileTest\\student.txt");
		System.out.println(f.getPath());
		System.out.println(f.getAbsolutePath());
		System.out.println(f.getName());
		System.out.println(f.exists());
		System.out.println(f.length());
		System.out.println(f.isFile());
		System.out.println(f.isDirectory());
		System.out.println(f.delete() );
		

	}

}
