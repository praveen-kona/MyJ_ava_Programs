package Files;

import java.io.File;
import java.io.IOException;

public class Existsfile {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		File f=new File("C:\\Users\\hi\\OneDrive\\Desktop\\FileTest\\student.txt");
		
		
		boolean isexists=f.exists();
		if(isexists)
		{
			System.out.println("your creatin file is already exist plz create a new file");
		}
	
		else
		{
			boolean status=f.createNewFile();
			if(status)
			{
				System.out.println("filr crrated suces");
			}
			else
			{
				System.out.println("not created");
			}
		}
	}

}
