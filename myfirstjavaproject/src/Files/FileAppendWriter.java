package Files;

import java.io.FileWriter;
import java.io.IOException;

public class FileAppendWriter {


		public static void main(String[] args) throws IOException {
			// TODO Auto-generated method stub
			FileWriter fw=new FileWriter("C:\\Users\\hi\\OneDrive\\Desktop\\FileTest\\Stduents3\\Stu3.text",true);
			fw.write("\npython");
			fw.close();
			System.out.println("success");

	}

}
