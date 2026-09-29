package Files;

import java.io.FileWriter;
import java.io.IOException;

public class FIleWriter {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileWriter fw=new FileWriter("C:\\Users\\hi\\OneDrive\\Desktop\\FileTest\\Stduents3\\Stu3.text");
		fw.write("hello praveen");
		fw.write("\njava");
		fw.write('c');
		fw.write("\n");
		fw.write(97);
		fw.close();
		System.out.println("Data successfully written");
	}

}
