package BuiltInFunctionalInterfaces;
class Student implements Comparable<Student>
{
	String name;
	int age;
	Student(int age)
	{
		this.age=age;
	}
	@Override
	public int compareTo(Student s)
	{
		return this.age-s.age;
		
	}
}
public class Comparabale_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1=new Student(20);
		Student s2=new Student(30);
		System.out.println(s1.compareTo(s2));

	}

}
