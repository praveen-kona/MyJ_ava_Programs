package Files;
import java.io.*;
public class WriteUsingFileWriter {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		File f=new File("C:\\Users\\hi\\git\\myjava\\myfirstjavaproject");
		
//		FileWriter fw=new FileWriter(f,true);
		String s="hello java";
//		fw.write("Hello");
//		fw.write("\n"+'c');
//		fw.write("\n"+78);
//		fw.write("\n");
//		fw.write(s.toCharArray());
//		fw.close();
		if(f.isDirectory())
		{
			for(String names:f.list())
			{
				System.out.println(names);
			}
		}
		
		
		

	}

}
