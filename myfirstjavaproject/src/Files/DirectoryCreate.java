package Files;

import java.io.File;
import java.io.IOException;

public class DirectoryCreate {

	public static void main(String[] args)  throws IOException{
		// TODO Auto-generated method stub
		File f=new File("C:\\Users\\hi\\OneDrive\\Desktop\\FileTest\\Stduents3");
		File f1=new File(f,"Stu3.text");
		f1.createNewFile();
		if(f.mkdirs())
		{
			System.out.println("Created");
		}
		else
		{
			System.out.println("not");
		}

	}

}
