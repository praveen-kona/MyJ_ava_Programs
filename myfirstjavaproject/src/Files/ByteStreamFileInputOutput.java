package Files;
import java.io.*;
public class ByteStreamFileInputOutput {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		FileInputStream fis=new FileInputStream("C:\\Users\\hi\\OneDrive\\Pictures\\Camera Roll\\WIN_20260913_19_23_11_Pro.mp4");
		
		FileOutputStream fos=new FileOutputStream("C:\\Users\\hi\\OneDrive\\Pictures\\Camera Roll\\vcopy.mp4");
		
		int i=fis.read();
		while(i!=-1)
		{
			System.out.println(i);
			fos.write(i);
			i=fis.read();
		}
		fos.close();
		fis.close();
//		File f=new File("C:\\Users\\hi\\OneDrive\\Pictures\\copy.jpg");
//		if(f.exists())
//			f.delete();
		System.out.println("Succsssfully bytes read and write into another file");

	}

}
