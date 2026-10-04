package SerializationAndDeserialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DEsInhertparenotSerButnoArg {

	public static void main(String[] args) throws ClassNotFoundException, IOException {
	
		ObjectInputStream ois=new ObjectInputStream(new FileInputStream("./stu5.ser"));
		Student_child s=(Student_child)ois.readObject();
		
		System.out.println(s.id);
		System.out.println(s.name);
		System.out.println(s.marks);
		System.out.println(s.age);
		
		ois.close();
		System.out.println("success read");

	}

}
