package SerializationAndDeserialization;


import java.io.*;
class SerializationwithInheritanceparentSer implements Serializable{
	
	int age;
	String name;
	SerializationwithInheritanceparentSer(int age,String name)
	{
		this.age=age;
		this.name=name;
	}
}
class StudentInh extends SerializationwithInheritanceparentSer
{
	int id;
	double marks;

	StudentInh(int age, String name,int id,double marks)
	{
		super(age, name);
		this.id=id;
		this.marks=marks;
	}

	
}

public class SerInhertanceParentSer {

public static void main(String[] args) throws  IOException {
		
		StudentInh s=new StudentInh(22,"praveen",101,90.09);
		ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("./stu3.ser"));
		oos.writeObject(s);
		
		System.out.println("Serialized");
		oos.close();
		
		
		
		

	}


}
