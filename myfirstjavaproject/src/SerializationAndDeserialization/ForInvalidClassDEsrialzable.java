package SerializationAndDeserialization;

import java.io.*;
public class ForInvalidClassDEsrialzable {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		
		FileInputStream fos=new FileInputStream("./stu.txt");
		ObjectInputStream ois=new ObjectInputStream(fos);
		
		SerialVersionUIDForInvalidClassException s=(SerialVersionUIDForInvalidClassException)ois.readObject();
		
		ois.close();
		System.out.println("succes");
		
		System.out.println(s.id);
		System.out.println(s.name);
		
		

	}

}
