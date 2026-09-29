package Files;
import java.io.File;
import java.io.IOException;
public class CreatingFIle {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File f=new File("C:\\Users\\hi\\OneDrive\\Desktop\\FileTest\\student.txt");
		boolean status=f.createNewFile();
		if(status)
		{
			System.out.println("File created successfully");
		}
		else
		{
			System.out.println("no file is created");
		}
		boolean res=f.delete();
		if(res)
		{
			System.out.println("deleted");
		}
		else
		{
			System.out.println("not");
		}

	}

}
