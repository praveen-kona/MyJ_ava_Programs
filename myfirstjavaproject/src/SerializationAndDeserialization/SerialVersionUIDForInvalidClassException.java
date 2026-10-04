package SerializationAndDeserialization;
import java.io.*;
public class SerialVersionUIDForInvalidClassException implements Serializable {
	
	private final static long serialVersionUID=3L;
	int id;
	String name;
	SerialVersionUIDForInvalidClassException(int id,String name)
	{
		this.id=id;
		this.name=name;
	}

	public static void main(String[] args) throws IOException {
		
		SerialVersionUIDForInvalidClassException s=new SerialVersionUIDForInvalidClassException(1,"praveen");
		 FileOutputStream fos=new FileOutputStream("./stu.txt");
		 ObjectOutputStream oos=new ObjectOutputStream(fos);
		 
		 oos.writeObject(s);
		 oos.close();
		 System.out.println("objcet serializable");
		 
		

	}

}
