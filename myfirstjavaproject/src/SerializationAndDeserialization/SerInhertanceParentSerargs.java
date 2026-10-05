package SerializationAndDeserialization;

import java.io.*;

class Person_2
{
	int age;
	String name;
	Person_2(int gae,String name)
	{
		this.age=age;
		this.name=name;
	}
}
class Student_5 extends Person_2 implements Serializable
{
	int id;
	double marks;
	Student_5(int age,String name,int id,double marks)
	{
		super(age,name);
		this.id=id;
		this.marks=marks;
	}

	
}
public class SerInhertanceParentSerargs {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		Student_5 s=new Student_5(101,"praveen",11,90.09);
		
		ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("./stu7.ser"));
		
		oos.writeObject(s);
		System.out.println("Succes");
		oos.close();
	}

}
