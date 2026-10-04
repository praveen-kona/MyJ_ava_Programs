package SerializationAndDeserialization;
import java.io.*;
public class MultipleObjectsDesriazable {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		
		FileInputStream fis=new FileInputStream("./stu2.ser");
		
		ObjectInputStream ois=new ObjectInputStream(fis);
		
		MultipleObjectSer s=(MultipleObjectSer)ois.readObject();
		
		MultipleObjectSer s1=(MultipleObjectSer)ois.readObject();
		MultipleObjectSer s2=(MultipleObjectSer)ois.readObject();
		
		
		System.out.println(s.id);
		System.out.println(s.name);
		System.out.println(s.pwd);
		System.out.println(MultipleObjectSer.sid);
		
		System.out.println(s1.id);
		System.out.println(s1.name);
		System.out.println(s1.pwd);
		System.out.println(MultipleObjectSer.sid);
		
		System.out.println(s2.id);
		System.out.println(s2.name);
		System.out.println(s2.pwd);
		System.out.println(MultipleObjectSer.sid);
		
		
		
		ois.close();
		
		System.out.println("successfully read !");
		

	}

}
