package SerializationAndDeserialization;

import java.io.*;
class Person1
{
	int age;
	String name;
	
	Person1()
	{
		age=22;
		name="praveen";
	}
	Person1(int age,String name)
	{
		this.age=age;
		this.name=name;
	}
}
class Student_child extends Person1 implements Serializable
{
	int id;
	double marks;
	
	Student_child(int age, String name,int id,double marks)
	
	{
		super(age,name);
		this.id=id;
		this.marks=marks;
		
	}
}
public class SerInhertparenotSerButnoArg {

	
	public static void main(String[] args) throws FileNotFoundException, IOException {
	
		Student_child s=new Student_child(20,"pandu",101,90.09);
		
		ObjectOutputStream  oos=new ObjectOutputStream(new FileOutputStream("./stu5.ser"));

		oos.writeObject(s);
		oos.close();
		System.out.println("Success read");
	}

}
