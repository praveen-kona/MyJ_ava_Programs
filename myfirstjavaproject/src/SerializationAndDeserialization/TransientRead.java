package SerializationAndDeserialization;
import java.io.*;
public class TransientRead {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		
		FileInputStream fis=new FileInputStream("./stu2.ser");
		
		ObjectInputStream ois=new ObjectInputStream(fis);
		
		Transient_Student s=(Transient_Student)ois.readObject();
		
		System.out.println(s.id);
		System.out.println(s.name);
		System.out.println(s.pwd);
		
		System.out.println("successfully read !");
		

	}

}
