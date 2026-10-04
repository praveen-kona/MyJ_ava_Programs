package SerializationAndDeserialization;
import java.io.*;
public class Transient_Student implements Serializable {
	
	private final static long serialVersionUID=3L;
	int id;
	String name;
	transient String pwd;
	

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Transient_Student s=new Transient_Student();
		s.id=101;
		s.name="praveen";
		s.pwd="praveen123";
		
		FileOutputStream fos=new FileOutputStream("./stu2.ser");
		
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		
		oos.writeObject(s);
		
		oos.close();
		System.out.println("Succes write");
		

	}

}
