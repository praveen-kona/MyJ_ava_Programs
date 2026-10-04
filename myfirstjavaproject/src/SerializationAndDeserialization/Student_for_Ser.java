package SerializationAndDeserialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Student_for_Ser implements Serializable{
	
	private static final long serialVersionUID = 2L;
	int id;
	String name;
	double marks;
	Student_for_Ser(int id,String name,Double marks)
	{
		this.id=id;
		this.name=name;
		this.marks=marks;
	}
	

	public static void main(String[] args) throws IOException {
		
		Student_for_Ser s=new Student_for_Ser(1,"praveen",90.09);
		
		FileOutputStream fos=new FileOutputStream("./student1.ser");
		
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		
		oos.writeObject(s);
		
		oos.close();
		
		   System.out.println("Object serialized");


	}

}
