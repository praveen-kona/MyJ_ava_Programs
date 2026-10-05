package SerializationAndDeserialization;
import java.io.*;
public class DesInhertanceParentSerargs {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		
		ObjectInputStream ois=new ObjectInputStream(new FileInputStream("./stu7.ser"));
		
		Student_5 s=(Student_5)ois.readObject();
		
		System.out.println(s.id);
		System.out.println(s.name);
		System.out.println(s.marks);
		System.out.println(s.age);
		
		System.out.println("Scuuess reda!");
		
		
		ois.close();
		
	}

}
