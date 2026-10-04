package SerializationAndDeserialization;
import java.io.*;
public class MultipleObjectSer implements Serializable {
	
	private final static long serialVersionUID=3L;
	int id;
	String name;
	transient String pwd;
	static int sid=999;
	

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		MultipleObjectSer s=new MultipleObjectSer();
		s.id=101;
		s.name="praveen";
		s.pwd="praveen123";
		
		MultipleObjectSer s1=new MultipleObjectSer();
		s1.id=1012;
		s1.name="nuthan";
		s1.pwd="nuthan123";
		
		MultipleObjectSer s2=new MultipleObjectSer();
		
		s2.id=103;
		s2.name="vishnu";
		s2.pwd="vishnu123";
		
		FileOutputStream fos=new FileOutputStream("./stu2.ser");
		
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		
		oos.writeObject(s);
		oos.writeObject(s1);
		oos.writeObject(s2);
		
		oos.close();
		System.out.println("Succes write");
		

	}

}
