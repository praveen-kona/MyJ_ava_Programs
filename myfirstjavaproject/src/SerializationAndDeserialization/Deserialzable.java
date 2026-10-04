package SerializationAndDeserialization;

import java.io.*;

public class Deserialzable {

	public static void main(String[] args) throws IOException,ClassNotFoundException,InvalidClassException  {
		
		FileInputStream fis=new FileInputStream("./student1.ser");
		
		ObjectInputStream ois=new ObjectInputStream(fis);
		
		Student_for_Ser s=(Student_for_Ser)ois.readObject();
		
		System.out.println(s.id);
		System.out.println(s.name);
		System.out.println(s.marks);
		
		ois.close();
		
		System.out.println("Read succssfully");
	}

}
