package Constructors;
class Student
{
	String name;
	int age;
	Student()
	{
		name="praveen";
		age=10;
	}
	void display()
	{
		System.out.println(name+" "+age);
	}
	
}
public class NoNPramaetrized {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s=new Student();
		s.display();

	}

}
