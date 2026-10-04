package SerializationAndDeserialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class SerInheritParentDesr {

	public static void main(String[] args) throws IOException, ClassNotFoundException {


FileInputStream fis=new FileInputStream("./stu3.ser");
		
		ObjectInputStream ois=new ObjectInputStream(fis);
		
		StudentInh s=(StudentInh)ois.readObject();
		
		System.out.println(s.id);
		System.out.println(s.name);
		System.out.println(s.age);
		System.out.println(s.marks);
		
		System.out.println("sccuses read");
		
		ois.close();

	}

}
