package Constructors;


class Student_c
{
	String name;
	int age;
	Student_c()
	{
		
		System.out.println("no arg constructor :");
	}
	Student_c(String name)
	{
		this();
		this.name=name;
		System.out.println(this.name);
		System.out.println("String constructor");
	}
	Student_c(String name,int age)
	{
		this("praveen");
		this.name=name;
		this.age=age;
		System.out.println(this.name);
		System.out.println(this.age);
		System.out.println("String + int constructor");
	}
}
public class ConstructorChaining {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student_c c=new Student_c("Praveen",20);
		

	}

}
