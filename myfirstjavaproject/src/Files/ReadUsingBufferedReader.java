package Files;
import java.io.*;


public class ReadUsingBufferedReader {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File f=new File("./student.txt");
		FileReader fr=new FileReader(f);
		//or
		FileInputStream fis=new FileInputStream(f);
		InputStreamReader isr=new InputStreamReader(fis);
		BufferedReader br=new BufferedReader(isr);
		String s=br.readLine();
		String text="";
		while(s!=null)
		{
			System.out.println(s);
			text+=s+"\n";
			s=br.readLine();
			
		}
		fr.close();
		br.close();
		System.out.println(text);
		

	}

}
