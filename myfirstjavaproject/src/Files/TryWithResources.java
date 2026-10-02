package Files;

import java.io.*;

public class TryWithResources {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		File f=new File("./hello.txt");
		try (FileReader fr = new FileReader(f);
				BufferedReader br=new BufferedReader(fr)) {
			String s="";
			String s1="";
			while((s=br.readLine())!=null)
			{
				s1+=s+"\n";
			}
			System.out.println(s1.trim());
		}
	}

}
