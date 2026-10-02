package Files;
import java.io.*;
public class ByteStreamBufferedInputOutputStream {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		BufferedInputStream bis=new BufferedInputStream(new FileInputStream("C:\\Users\\hi\\OneDrive\\Pictures\\passs - Copy.jpg"));
		
		
		BufferedOutputStream bos=new BufferedOutputStream(new FileOutputStream("C:\\Users\\hi\\OneDrive\\Pictures\\copy2.jpg"));
		
		byte[] buffer=new byte[2690906];
		int i=bis.read(buffer);
		while(i!=-1)
		{
			bos.write(buffer,0,i);
			i=bis.read(buffer);
		}
		bos.close();
		bis.close();
		System.out.println("Successfully readed");
		

	}

}
